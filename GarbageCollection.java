package com.java.writen.test;

//Ways to make an object eligible for garbage collection
class GarbageCollection
{
     
    // to store object name
    String obj_name;
     
    public GarbageCollection(String obj_name) 
    {
        this.obj_name = obj_name;
    }
     
    public static Object meth(GarbageCollection mx) {
		return mx;
		
	}
    
    static void show()
    {
        //object t1 inside method becomes unreachable when show() removed
        GarbageCollection t1 = new GarbageCollection("t1"); 
        
        display();
         
    }
    static void display()
    {
        //object t2 inside method becomes unreachable when display() removed
        //GarbageCollection t2 = new GarbageCollection("t2"); 
        GarbageCollection t2 = new GarbageCollection("t2"); 
        GarbageCollection t3 = (GarbageCollection) meth(t2); 
        GarbageCollection t4 = new GarbageCollection("t4"); 
        t2 = t4;
    }
     
    // Driver method
    public static void main(String args[])
    {
        // calling show()
        show();
        
     // calling display()
      //  display();
         
        // calling garbage collector
        System.gc();
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