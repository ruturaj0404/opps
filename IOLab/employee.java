package IOLab;
import java.io.*;

/*
 *  Define a class employee having fields like name ,age and salary .
define getdata () and ask employee record from user using buffered reader class .
b) create check method that check if salary > 20000 then add 10% to
salary else add 15% to salary
c) create display method () that display all record on console
d) Create another class record having main method .call all functions in main method 
 */
public class employee {
	String name;
	int age;
	float salary;
	void getdata() {
		try {
	
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("Enter name of Employee");
	name=b.readLine();
	System.out.println("Enter age of Employee");
	age=Integer.parseInt(b.readLine());
	System.out.println("Enter salary of Employee");
	salary=Float.parseFloat(b.readLine());
	
	}catch (Exception e) {}
	}
	
	void check() {
			if(salary>20000) {
				salary=(salary*10/100)+salary;
			}else salary=(salary*15/100)+salary;
	}
	void display() {
		System.out.println("name: "+name+"\nage: "+age+"\nsalary: "+salary);
	}

}
