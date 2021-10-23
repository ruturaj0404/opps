package opps_exception;

import java.util.Scanner;

/*define class person having fields like name and age
create getter and setter
in main call all methods and check if age >=18 print eligible for voting
else throw exception "Exception"
and in main only handle exception raised with appropriate message*/

public class person {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
	public static void main(String[]a) {
		Scanner s=new Scanner(System.in);
		 person p=new person();
		 System.out.println("enter name and age");
		 String n=s.nextLine();
		 int ag=s.nextInt();
	     p.setName(n);
	     p.getName();
	     p.setAge(ag);
	     p.getAge();
	    try
	    {
	     int age=p.getAge();
	     if(age>18)
	         System.out.println("Eligible for voting");
	     else
	         throw new ArithmeticException();
	    }
	    catch(ArithmeticException x)
	    {
	        System.out.println("Exception:not eligible");
	        System.out.println(x.getMessage());
	    }finally {
	    	System.out.println("rejected");
	    }


	    }
	}
	


