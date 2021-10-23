package oct_20;

import java.util.Scanner;

public class training {
	int student_id;
	String name;
	String add;
	int phone_no;
	class online_traning{
		int duration;
		int online_marks;
		void getdata() {
			student_id=1234;
			name="ruturaj";
			add="123,ganesh complex,pune";
			duration=5;
			online_marks=35;
			
		}
		void show_data() {
			System.out.println(duration+" "+online_marks+" "+student_id+" "+student_id+" "+name+" "+add);
		}
	}
	class offline_traning{
		 boolean systemallocation;
		 int offline_marks;
		 void input() {
			 systemallocation=true;
			 offline_marks=100;
		 }
		 void display() {
			 System.out.println( systemallocation+" "+offline_marks);
		 }
	}
public static void main(String[]args) {
	training t = new training();
	Scanner s=new Scanner(System.in);
	System.out.println("enter choice");
	System.out.println("1.online traning");
	System.out.println("2.offline traning");
	int choice=s.nextInt();
	switch (choice) {
	case(1):
		online_traning on = t.new online_traning();
    on.getdata();
	on.show_data();
	break;
	case(2):
		offline_traning a= t.new offline_traning();
	a.input();
	a.display();
	break;
	}
	
	
	
	}

}

