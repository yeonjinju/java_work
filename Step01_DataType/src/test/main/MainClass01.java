package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long (소수점이 없는 정수)
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double (소수점이 있는 실수)
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 정수형 변수 선언하고 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10000;
		long iLong=10;
		/*
		* int type 변수에 byte type 변수에 담긴 내용을 대입한다면?
		* - 표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에
		* 대입하는 것은 문제가 없다.
		* - 따라서 에러를 발생 시키지않는다.
		*/
		int tmp=iShort;
		/*
		 * 표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면
		 * 명시적으로 casting을 해야된다.
		 */
		int tmp2=(byte)iShort;
		
		// 실수형 변수 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3; // d,f를 붙히지 않으면 double type으로 간주된다.
		
		// float type에 있는값을 double type에 담기
		double tmp3=num1;
		
		float tmp4=(float)num2;
		
		System.out.println("main 메소드가 종료됩니다.");
		
	}
}
