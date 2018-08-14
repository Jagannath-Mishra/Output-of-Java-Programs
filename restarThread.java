package com.java.writen.test;

public class restarThread extends Thread {
	public static void main(String[] args) {
		MyCustomeThread t1 = new MyCustomeThread();
		t1.start();
		//t1.start(); //Runtime exception
	}
	
	
	
}

class MyCustomeThread extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}
