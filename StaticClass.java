package com.java.writen.test;

public class StaticClass {
	
	public StaticClass() {
		System.out.println("I am constructor ");
	}
	
	static {
		System.out.println("I am static blcok ");
	}
	
	{
		System.out.println("I am initialisation block ");
	}
	
	public static void main(String[] args) {
		new StaticClass();
	}
	
	//Output:// I am static blcok 
	//I am initialisation block 
	//I am constructor 

}
