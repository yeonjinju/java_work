package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  Java.util 패키지에 있는 Random 클래스 사용해보기
		 *  
		 */
		Random ran=new Random();
		
		// 0~9 사이의 랜점한 정수를 얻어내서 ranNum이라는 지역변수에 담아보세요.
		int ranNum=(ran.nextInt(10));
		// ramNum 지역변수에 담기 내용을 콘솔창에 출력해보세요.
		System.out.println(ranNum);
		
	}
}
