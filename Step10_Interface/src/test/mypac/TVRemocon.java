package test.mypac;

public class TVRemocon implements Remocon {
	@Override
	public void up() {
		System.out.println("TV채널을 올려요");
	}
	
	@Override
	public void down() {
		System.out.println("TV채널을 내려요");
	}
	
	// 메소드 추가하고싶다
	public void reserve(){
		System.out.println("전원 off를 예약합니다.");
	}
}
