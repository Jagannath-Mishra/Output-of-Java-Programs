package com.java.writen.test;
public class CloneNotSupportedExceptionTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    CloneDemo2 cd2 = new CloneDemo2();
    System.out.println(cd2.salary);

    AnotherClass ac = new AnotherClass();
    System.out.println(ac.gradeLetter);

    AnotherClass y = (AnotherClass) ac.clone();
    System.out.println(y.gradeLetter);
    
    CloneDemo2 z = (CloneDemo2) cd2.clone();
    System.out.println(z.salary);
  }
}
/*class CloneDemo2 implements Cloneable {
  double salary = 50000.0;

}*/

class CloneDemo2   {
	  double salary = 50000.0;
	  public Object clone() throws CloneNotSupportedException {
		    return super.clone();
		  }
	}

class AnotherClass implements Cloneable {
  char gradeLetter = 'C';

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}