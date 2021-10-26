package exception_handling_lab;

import java.util.Scanner;

public class Q3_trucks extends Q3_vehical {
	int speed1;
	public void set_speed(int s) throws Q3_ExtendException
	{
		speed1=s;
		if(speed1>40) throw  new  Q3_ExtendException(" your speed greater than 40 ");
		else
		{
			System.out.println("your truck speed is good ");
		}
	}

	public static void main(String[] args) throws Q3_ExtendException{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter truck speed ");
		int s=scan.nextInt();
	
		
		Q3_trucks t1=new Q3_trucks();
		t1.set_speed(s);
}
}
