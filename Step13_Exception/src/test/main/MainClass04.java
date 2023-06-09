package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작 되었습니다.");
		
		try {
			/*
			 *  실행의 흐름을 스레드라고 하는데 스레드를 임의로 5초동안 잡아두기
			 *  컴파일 시에 발생하는 Exeption(RuntimeException을 상속받지 않은 Exceptio)이 발생하기 때문에 반드시 try~catch블럭으로 예외처리 해야한다.
			 *  
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main메소드가 종료 되었습니다.");
	}
}
