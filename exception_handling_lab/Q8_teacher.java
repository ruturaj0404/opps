package exception_handling_lab;
/*
8  Write a program  in java. A class Teacher contains two fields Name and Qualification.
Extends the class to department it contains dept. no and Dept Name. An interface named
as college it contains one field name of the college. Using the above classes
and interface get the appropriate information and display it.
Ask Deptno from user if deptno is not 10 or 20 or 30 throw NoDeptartmentException (userdefined exception) and
with appropriate message terminate program .
else call display method if all data is valid

 */

import java.util.Scanner;

class user_defined_exception extends Exception{
	user_defined_exception(){
		super("Department not found!");
//		System.out.println("exception raised");
	}

}

interface college {
	
	String name_of_collage = "cdac noida";

	

}
class department implements college{
	int deptNo;
	String deptName;

	public void setValue(String deptName, int deptNo) {
		this.deptName = deptName;
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void getDeptNo() throws user_defined_exception {
		if (deptNo == 10 || deptNo == 20 || deptNo == 30) {
//			System.out.println("Entered value of department no. is valid");
		} else
			throw new user_defined_exception();
	}
}

public class Q8_teacher extends department {
	String name = "ruturaj";
	String qualification = "BE";
	void display() {
		System.out.println("Teacher Name: - " + name);
		System.out.println("Qualification: - " + qualification);
		System.out.println("Department Name: - " + deptName);
		System.out.println("Department No: - " + deptNo);
	}
	public static void main(String[]a)throws user_defined_exception {

	

		Q8_teacher t = new Q8_teacher();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Department No:  ");
			int no = sc.nextInt();
			t.setValue("PgDAC", no);

			try {
				t.getDeptNo();
				t.display();
			} finally {
				System.out.println("after finally");
			}
		}

}



	