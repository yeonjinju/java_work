package Test.mypac;
/*
 *  [메소드를 만들때 고려해야 하는것]
 *  
 *  1. 접근 지정자(모르면 public)
 *  2. static or non static (모르면 non static)
 *  3. 리턴 type (모르면 viod)
 *  4. 메소드명
 *  5. 메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class Test {
	public void walk() {
		System.out.println("걸어요!");
	}
	
	public int getNumber() {
		return 10;
	}
	
	public String getGreeting() {
		return "안녕하세요";
	}
}