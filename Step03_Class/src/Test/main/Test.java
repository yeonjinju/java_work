package Test.main;

import Test.main.Test;

public class Test {
	
	int a = 0;
	int b = 0;
	
	public void name(int a, int b) {
		int c=a +b;
		System.out.println(c);
		this.a = b;
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.name(5, 3);
		
		
	}
}
