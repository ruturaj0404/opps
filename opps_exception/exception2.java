package opps_exception;

import java.util.Scanner;

/*wap to ask password   from user and check if password ==1234 then print welcome message else throw exception .
In main handle exception using try catch and print appropriate message for exception that is raised
*/
public class exception2 {
	public static void main(String[]a) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter password");
		try{
			int code=s.nextInt();
		 
		if (code==123) System.out.println("welcome");
		
		else throw new ArithmeticException();}catch(ArithmeticException ee)
		  {	  System.out.println("this is wrong code");  }
		  finally
		  {	  System.out.println("finally block");  }

			}
		
	}


