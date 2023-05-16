package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainClass001 extends JFrame implements ActionListener{
	
//	swing gui 를 이용해서
//	번호, 이름, 주소를 입력하고 저장하기 버튼을 누르면 회원 한명의 
//	정보가 실제 DB에 저장하는 프로그래밍 해 보세요.
//	JTextField 3개, JButton 한개를 gui로 프레임에 배치해야됨
	
	// 필드
	JTextField num, name, addr;
	
	// 생성자
	public MainClass001(String title) {
		super(title);
		// gui크기 설정
		this.setBounds(100, 100, 500, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(new FlowLayout());
	    
		//텍스트필드
		this.num=new JTextField(10);
		this.name=new JTextField(10);
		this.addr=new JTextField(10);
		
		// 버튼
		JButton saveBtn=new JButton("저장하기");
		
		// UI를 프레임에 배치
		add(num);
		add(name);
		add(addr);
		add(saveBtn);
		
//		// 버튼에 액션 리스너 등록하기
//		saveBtn.addActionListener(this);
//		// 버튼에 액션코맨드 설정하기
//		saveBtn.setActionCommand("save");

		// 프레임을 화면상에 실제 보이게 하기 (false 하면 화면에 보이지 않는다)
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainClass001("DB 추가하기");
	}
	
	public void actionPerformed(ActionEvent e) {
		// DB연결객체를 담을 지역변수 만들기
		Connection conn=null;
		try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e1) {
	         e1.printStackTrace();
	      }
		String n=num.getText();
		String na=name.getText();
		String a=addr.getText();
		// Sting으로 값을 받았기 때문에 Int형으로 변경
		int num1 = Integer.parseInt(n);
		// sql문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
	    PreparedStatement pstmt=null;
	    try {
	    	// 실행할 미완성의 sql문
	    	String sql="INSERT INTO member" + " (num, name, addr)" + " VALUES(?, ?, ?)";
	    	// 미완성의 sql문을 전달하면서 PreparedStatement객체의 참조값 얻어내기
	    	pstmt=conn.prepareStatement(sql);
	    	// PreparedStatement객체의 메소드를 이용해서 미완성인 sql문을 완성시키기(?값에 바인딩하기)
	    	pstmt.setInt(1, num1); //1번째 ?에 숫자 바인딩
	    	pstmt.setString(2, na); // 2번째 ?에 문자열 바인딩
	    	pstmt.setString(3, a); // 3번째 ?에 문자열 바인딩
	    	//sql문 실행하기
	    	pstmt.executeUpdate();
	    	System.out.println("회원정보를 저장했습니다.");
	    }catch (Exception e1) {
			e1.printStackTrace();
	    }    
		
	}
}	




