package com.java.writen.test;

public class howManyObjectForGC {
	  String obj_name;
	public howManyObjectForGC(String obj_name) 
	
    {
        this.obj_name = obj_name;
    }
	
	public static void main(String[] args) {
		howManyObjectForGC obj0 = new howManyObjectForGC("obj0");
		howManyObjectForGC obj1 = new howManyObjectForGC("obj1");
		howManyObjectForGC obj2 = (howManyObjectForGC) meth(obj0);
		howManyObjectForGC obj3 = new howManyObjectForGC("obj3");
		obj2 = obj3; // How many object will be free for gc
		
		System.out.println("calling garbage collector");
        System.gc();
	}
	
	public static Object meth(howManyObjectForGC mx) {
		return mx;
		
	}
	 @Override
	    /* Overriding finalize method to check which object
	    is garbage collected */
	    protected void finalize() throws Throwable 
	    {
	        // will print name of object
	        System.out.println(this.obj_name + " successfully garbage collected");
	    }
}
