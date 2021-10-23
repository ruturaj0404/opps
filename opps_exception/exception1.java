package opps_exception;

import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		try {
			int i=12/0;
			System.out.println("i="+i);
			
		}catch(Exception e) {
			System.out.println("finally ");
		}
		finally
		{System.out.println("finally code");
		}
		
		System.out.println("after");
		
		
		}
}
