package OOPSAssignment_1_1;

import java.util.Scanner;

public class question_12 {
	int a=0;
	question_12(){
		System.out.println(a);
		
	}
	question_12(int a){
		this.a=a;
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n1=s.nextInt();
		System.out.println("enter again");
		boolean n = s.hasNextInt();
		if (n) {
			 new question_12(n1);
		} else {
			 new question_12();
		}
			

	}

}
