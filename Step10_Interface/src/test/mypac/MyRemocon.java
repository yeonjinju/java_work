package test.mypac;
/*
 * 인터페이스를 implements하면 인터페이스에 정의되어 있는 모든 추상메소드를 오버라이드 해야된다(강제)
 */
public class MyRemocon /* extends Object 생략 */ implements Remocon{ 
	/* public MyRemocon() {} 생략 */
	@Override
	public void up() {
		System.out.println("채널을 올려요!");
	}
	@Override
	public void down() {
		System.out.println("채널을 내려요!");
	}
}
