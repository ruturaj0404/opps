package XYZ;
import java.io.*;
import java.util.Scanner;

public class patient implements Serializable {
	String patient_name;
	String patient_Add;
	int p_id;
	int P_mobileno;
	void get_data() {
		Scanner s=new Scanner (System.in);
		System.out.println("enter patient name: ");
		patient_name = s.nextLine();
		System.out.println("enter patient ADD: ");
		patient_Add =s.nextLine();
		System.out.println("enter patient id: ");
		p_id=s.nextInt();
		System.out.println("enter patient contact NO.: ");
		P_mobileno=s.nextInt();
	}
		void display() {
			System.out.println("patient name:"+patient_name+"/npatient ADD:"+patient_Add+" /npatient id:"+p_id+"/npatient contact NO.:"+P_mobileno);
		}
	void count(int count) {
		System.out.println("no of patient:"+count);
	}
}
