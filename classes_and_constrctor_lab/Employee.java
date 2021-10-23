package classes_and_constrctor_lab;

import java.util.Scanner;

public class Employee {
	int salary;
	float working_hr;
	
	void getInfo(int s,float hr) {
		salary=s;
		working_hr=hr;
		
	}
	void Addsal() {
		if(salary<50000) {
			salary=salary+10000;
//			return salary;
		}
		
	 }
	void ADDwork() {
		if(working_hr>6) {
			salary=salary+5000;
		}
		
	}
	void display() {
		System.out.println("final salary="+salary);
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter salary and working hrs");
		int s1=s.nextInt();
		int h1=s.nextInt();
		Employee e=new Employee();
		e.getInfo(s1,h1);
		e.Addsal();
		e.ADDwork();
		e.display();
		
		
	}

}
