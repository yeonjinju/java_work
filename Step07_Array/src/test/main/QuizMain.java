package test.main;

import java.security.PublicKey;
import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		
		/*   
		 *   1. run 했을때
		 *		cherry, apple, banana, melon, 7
		 *      5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.  
		 */
		
		String [] names=new String[5];
		names[0] = "cherry";
		names[1] = "apple";
		names[2]= "banana";
		names[3]= "melon";
		names[4]= "7";
		Random ran =new Random();
		int a = ran.nextInt(5);
		int b = ran.nextInt(5);
		System.out.println(names[a]+names[b]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		String [] list = {"cherry", "apple", "banana", "melon", "7"};
//		Random ran = new Random();
//		int ranList = ran.nextInt(5);
//		System.out.println(list[ranList]);
	}
}
