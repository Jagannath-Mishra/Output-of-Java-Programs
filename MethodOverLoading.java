package com.java.writen.test;

public class MethodOverLoading {

	public MethodOverLoading() {
		System.out.println("Constructor Running");
	}
	
	public MethodOverLoading(String S) {
		System.out.println("String Running");
	}
	
	public MethodOverLoading(Object O) {
		System.out.println("Object Running");
	}
	
	public static void main(String[] args) {
		MethodOverLoading mo = new MethodOverLoading();
		new MethodOverLoading(null);
		new MethodOverLoading(mo);
		
		System.out.println("Next");
		new MethodOverLoading(new MethodOverLoading());
	}
}
