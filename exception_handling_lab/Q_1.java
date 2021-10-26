package exception_handling_lab;

//1 Write a program to demonstrate the use of static block 

 class add {
	 
   static int x=10;
   int x1=20;
//we can run static block without main method only in jdk version 1.7and previous
//you can call only static variable in this block
//Remember: Static blocks can also be executed before constructors.

   static{
	   
	    System.out.println("Static block run");
        System.out.println("Static variable"+x);
        
//	System.out.println("non Static variable"+x1);
     }
   
   add (){
	   
	    System.out.println("\nconstructor called");
	    
        }
 }
 
// we have two objects, static block is executed only once
 
 class Q_1{
	  
	    // Main driver method
	    public static void main(String args[])
	    {
	  
	    	add a1=new add();
	    	add a2=new add();
	        
	    }
	}