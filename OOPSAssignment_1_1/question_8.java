package OOPSAssignment_1_1;

import java.util.Scanner;

//Q 8 Write a JAVA program which contains a method cube() such that cube(3) returns 27, 
//cube(0.2) returns 0.008. 

public class question_8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		question_8 c=new question_8();
		System.out.println("cube of your number is "+c.cube(num));
		
	}

	/*public static int cube(int num) {
		return num*num*num;
	}
*/
	int cube(int num) {
		 num=num*num*num;
		return (num);
	}
}
