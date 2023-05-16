package test_main;

import test_mypac.Airplane;
import test_mypac.test;

public class MainClass02 {
public static void main(String[] args) {
	test t=new test();
	
	t.send();
	// 값을 즉석해서 만들어서 전달
	t.send(10);
	t.send("xxx");	
	t.send(new Airplane());
	
	// 참조된 값을 전달할수도 있다.
	int a=999;
	t.send(a);
	
	String b = "하이";
	t.send(b);
	
	Airplane c = new Airplane();
	t.send(c);
	
	}
}
