package OOPSAssignment_1_1;
//7 Write a JAVA program which contains a method square() such that square(3) returns 9, 
//square(0.2) returns 0.04. 

import java.util.Scanner;

public class question_7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s.nextInt();
		System.out.println("square of "+num+" is "+square(num));

	}
	public static int square(int num) {
		return num*num;
	}

}
