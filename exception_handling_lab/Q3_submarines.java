package exception_handling_lab;

import java.util.Scanner;

public class Q3_submarines extends Q3_vehical {
	int speed2;
	public void set_speed(int s) throws  Q3_ExtendException
     {
		speed2=s;
	    if(speed2>100) throw  new Q3_ExtendException(" your speed limit greater than 100 ");
	    else 
     {
	    System.out.println(" your submarine speed is good ");
     }
   }

public static void main(String[] args) throws Q3_ExtendException{
	Scanner scan=new Scanner(System.in);
	
	System.out.println(" enter submarien speed ");
	int s1=scan.nextInt();
	
	
	Q3_submarines sm=new Q3_submarines();
	sm.set_speed(s1);
}
}

