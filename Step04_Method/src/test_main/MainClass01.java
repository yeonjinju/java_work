package test_main;

import java.io.File;
import java.util.Scanner;

import test_mypac.Airplane;
import test_mypac.test;

public class MainClass01 {

	public static void main(String[] args) {
		// 클래스명 a = new 클래스명();
		test t=new test();
		
		// return type이 void인 메소드 호출
		t.walk();
		// return type이 int인 메소드 호출하고 리턴되는 값을 a라는 int type 지역변수에 담기
		int a = t.getNumber();
		// return type이 String인 메소드 호출하고 리턴되는 값을 b하는 String type 지역변수에 담기
		String b = t.getGreeting();
		// return type이 Airplane인 메소드를 호출하고 리턴되는 값을 c라는 Airplane type 지역변수에 담기
		Airplane c = t.getAirplane();
		c.fly();
		// 위에서 생성한 객체의 setNum() 메소드를 호출해보세요
		t.setNum(100);
		// 위에서 생성한 객체의 setName() 메소드를 호출해보세요
		t.setName("주연진");
		// 위에서 생성한 객체의 setPlane() 메소드를 호출해보세요
		t.setPlane(new Airplane());
		
		t.doSomething(100, "연진", new Airplane());
		
		Car3 d =new Car3();
//		c.kind;
		d.move();
		System.out.println(d.dd());
		
		
		
		
		System.out.println("main 메소드가 종료 됩니다.");
		
	}
}
class Car3 {
	String kind = "ㅏㅏㅏ";
	boolean start;
	
	public void move() {
		System.out.println("ㅎㅇ");
	}
	
	String dd() {
		return "ff";
	}
    

	
}
