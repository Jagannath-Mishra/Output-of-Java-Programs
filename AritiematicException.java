package com.java.writen.test;

public class AritiematicException {
	
	public int runException() {
		int a=10;
		int b=20;
		int c=0;
		int d=0;
		
		c = a+b;
		try {
			if(c>0) {
				d=a/c;
			}
			return d;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}
		return 50;
		
	}
	
	public static void main(String[] args) {
		AritiematicException ob = new AritiematicException();
		
		System.out.println(ob.runException());
	}
}
