package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="김구라";
		String addr="독산동";
		//위의 정보를 이용해서 1번회원의 정보를 수정하고 성공하면 "수정했습니다"가 출력되도록 해 보세요.
		
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		// 생성자의 인자로 회원정보를 전달해서 객체를 생성할수도 있다.
		MemberDto dto2=new MemberDto(num, name, addr);
		
		// MemberDao 객체를 생성해서 update()메소드를 이용해서 수정하고 성공여부 리턴받
		boolean inSuccess=new MemberDao().update(dto);
		if(inSuccess) {
			System.out.println("수정했습니다.");
		}
	}
}
