package Test.main;

import Test.mypac.Box;

/*
 *  test.mypac 패키지에 클래스를 하나 만들어 보세요.
 *  
 *  - 사각형의 폭(width), 높이(height)를 필드에 저장할 수 있어야 한다.
 *  - 필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드를 가지고 있어야 한다.
 *  - 필드와 메소드는 모두 non static 으로 만드세요.
 *  - 클래스명, 필드명, 메소드명은 여러분이 마음대로 정해보세요.
 */

public class MainClass10 {
		public static void main(String[] args) {
		// 클래스를 만들었다면 여기에 코드를 추가해서 테스트를 해보세요.
		Box box= new Box();
		box.width=30;
		box.height=30;
				
		box.name(); // 추출하기
				
		Box box2= new Box();
		box2.width=40;
		box2.height=40; 
				
		box2.name(); // 추출하기 
				
				
		}
}
