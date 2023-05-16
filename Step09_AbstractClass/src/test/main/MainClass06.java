package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		
		// 아래에 있는 useWeapon() 메소드를 호출하려면 Weapon type의 참조값이 필요하다.
		// 익명의 Local
		Weapon w1 =new Weapon() { // 이름이 없는 익명의 클래스이다, extends Weapon 한 클래스 이다.
			@Override
			public void attack(){
				System.out.println("아무나 공격하자!");
			}
		};
		// 사용하기
		useWeapon(w1);
		
		// 메소드를 호출할때 바로 익명 클래스를 이용해서 Weapon type의 참조값을 얻어내서 사용하기		
		useWeapon(new Weapon(){
			@Override
			public void attack() {
			System.out.println("김구라를 공격해요!");
			}
		});	
	}
	// Weapon type의 참조값을 전달받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
		
	}
}
