package com.java.writen.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	
	
	public static void main(String[] args)  {
		
		try {
			testMethod();
		} catch (FileNotFoundException exp | IOException exp ) {
			// Throw Complile Time Error Not Runtime.
			// Because : The exception FileNotFoundException is already caught by the alternative IOException
		}
	}
	
	public static void testMethod() throws IOException,FileNotFoundException{
		
	}
	
}
