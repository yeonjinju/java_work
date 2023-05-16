package test.main;
/*
 * [java 참조 데이터 type]
 * 
 * String type
 * 
 * - 문자열을 다룰때 사용하는 데이터 type이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "김구라"라는 String type 객체를 heap영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name="김구라";
		System.out.println(name);
		// name 안에 있는 참조값을 tmp변수에 복사해주기
		String tmp=name;
		System.out.println(tmp);
		// "원숭이"라는 String type객체를 heap영역에 만들고 그 참조값을 name 변수에 담기
		name="원숭이";
		// name 변수를 비우기 (null은 참조 데이터 type이 담길수 있는 빈 공간을 의미한다.)
		name=null;
	}
}
