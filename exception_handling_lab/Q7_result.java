package exception_handling_lab;
/*
Write a program   for user defined Exception that checks the external and internal marks if the
internal marks is greater than 40 it raise the exception internal mark is  exceed, 
if the external mark is greater than 60 exception is raised and display  the message the external marks is exceed, 
create the above exception and use it  in your program.*/
import java.util.Scanner;

public class Q7_result {
	static int i,e;
	
	static void internal_marks(int i) throws Q7_user_exception {
		if(i>40) throw new Q7_user_exception();
		else {System.out.println("internal marks less than 40--->"+i);}
	}
	
	static void external_marks(int e) throws Q7_user_exception {
		 if(e>60) throw new Q7_user_exception("external marks is greater than 60");
		   else System.out.println("external marks is less than 60--->"+e);
			
		}  


	public static void main(String[]a) throws  Q7_user_exception{
		Scanner s=new Scanner(System.in);
		try {
		
		System.out.println("enter marks");
		int x=s.nextInt();
		internal_marks(x);}
		catch(Q7_user_exception p){
			p.printStackTrace();
//			System.out.println("internal marks exceed");
		}
		try {
			System.out.println("enter marks");
			int y=s.nextInt();
			external_marks(y);
		} catch(Q7_user_exception q) {
			q.printStackTrace();
//			System.out.println("external marks exceed");
		}
		
//		Q7_result n=new Q7_result();
//		n.internal_marks(x);
//		n.internal_marks(e);
	
		
		
	}

}
