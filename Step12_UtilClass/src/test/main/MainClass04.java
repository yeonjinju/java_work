package test.main;


import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

import test.mypac.Car;


public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서 참조값을 List 인터페이스 type 지역변수 cars에 담아보세요.
	    List<Car> cars=new ArrayList<>();
	    cars.add(new Car("아반떼"));
	    cars.add(new Car("쏘나타"));
	    cars.add(new Car("그랜져"));
	    
		//일반 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출해 보세요.
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).drive();
		}
	    System.out.println("------");
		//확장 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출해 보세요.
	    for (Car sss : cars) {
			sss.drive();
		}
	    System.out.println("-------------");
		//Consumer 인터페이스를 활용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출해 보세요.
	    cars.forEach((t)->{
	    	t.drive();
	    });
	   
// 		Consumer 기본형식
//	    Consumer<Car> con =new Consumer<Car>() {
//	         @Override
//	         public void accept(Car t) {
//	            t.drive();
//	         }
//	      };
	}
}
