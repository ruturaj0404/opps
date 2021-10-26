package exception_handling_lab;
//Write a program to  demonstrate the finally block.

import java.util.Scanner;

public class Q6_finallyblock {
	public static void main(String[]a) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
		int result=x/y;
			System.out.println(result);
		}
		catch( Exception e){
			System.out.println("not divisible by zero");
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("after finally");
	}

}
