package linkedlist;
import java.util.*;
public class studentrecord {

	public static void main(String[] args) {
		LinkedList <student> l = new LinkedList<>();
		student s []=new student[5];
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<5; i++) {
		System.out.println("Enter Student Name, Roll No. and Marks");
		String a = sc.next();
		int b = sc.nextInt();
		int c = sc.nextInt();
		s[i] = new student(a,b,c);
		l.add(s[i]);
		}
		
		
		System.out.println(l);
	}
}
