package OOPSAssignment_1_1;

import java.util.Scanner;

public class employee {

	void get() {
//		int employee_id []=new int[6];
		String name []=new String [6];
		int salary[]=new int[6];
         Scanner s=new Scanner(System.in);
        int employee_id []=new int[6];
      for(int i=0;i<6;i++)
		{
		 System.out.println("enter emplyee id");
		 employee_id[i]=s.nextInt();
		}
		
	}
	public static void main(String[] args) {
		employee e=new employee();
		e.get();
		
	}

}
