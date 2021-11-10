package Day2;
import java.io.*;
import java.util.*;
import Day1.*;
public class Record extends Student {
public Record(String name, int rollno) {
		super(name, rollno);
		// TODO Auto-generated constructor stub
	}

public static void main(String a[]) throws Exception {
	try {
	Student s1=new Student("jhon",123);
	Student s2=new Student("roy",129);
	Student s3=new Student("akash",987);
	Student s4=new Student("utkarsh",923);
	Student s5=new Student("uma",193);
	ArrayList<Student> AR=new ArrayList();
	AR.add(s1);
	AR.add(s2);
	AR.add(s3);
	AR.add(s4);
	AR.add(s5);
	ObjectOutputStream oi= new ObjectOutputStream(new FileOutputStream ("file123.txt"));
	oi.writeObject(AR);
	oi.close();
	 ObjectInputStream o= new ObjectInputStream(new FileInputStream ("file123.txt"));
	 ArrayList w;
	 w=(ArrayList)o.readObject();
//	 System.out.println(w);
	 Iterator it =w.iterator();
	 Student x;
	 while(it.hasNext()){
		 x=(Student)it.next();
		 System.out.println(x.Name);
	 }
	 
	}catch(Exception e1) {
		System.out.println(e1);
	}
	 
	 
	 
	 
}

}
