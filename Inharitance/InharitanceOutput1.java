package com.example.demo;

import java.io.IOException;

public class InharitanceOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	b ob = new b();
	a ab = ob;
	a.test1();
	ab.test2();
	ob.test1();
	}
}

class a{
	
	protected static void test1() throws IOException{
		System.out.println("Test of India");
	}
	
	public static void test2(){
		System.out.println("Test of Bharat");
	}
}

class b extends a{
	public static void test1(){
		System.out.println("Test of India SuB");
	}
	
	public static void test2() throws IOException{
		System.out.println("Test of Bharat Sub");
	}
}