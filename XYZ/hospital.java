package XYZ;
import java.io.*;
import java.util.Scanner;
public class hospital  {

	public static void main(String[] args) throws Exception {

		Scanner s=new Scanner(System.in);
		
		System.out.println("a.patient") ;
		System.out.println("b.doctor ");
		System.out.println("enter choice");
		String x=s.next();

		if(x.equals("a")) {

			System.out.println("1.Add new patient");
			System.out.println("2.display all patients");
			int z=s.nextInt();
//			switch (z) {
		
//			case 1 :
				patient p=new patient();
				p.get_data();
				try {
				
				File f=new File("file_patient.txt");
			FileOutputStream fo=new FileOutputStream("file_patient.txt",true);

			if(f.length()<0) {
				
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(p);
			}else{
			Apendable aa=new Apendable(fo);
			aa.writeObject(p);
			}
			System.out.println("...Successfully added patient's record...");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
//			break;
//			case 2:
			try {	
				ObjectInputStream oi=new ObjectInputStream(new FileInputStream("file_patient.txt"));
				int count=0;
				do {
					p=(patient) oi.readObject();
					count++; 
					p.display();
				}while(p!=null);
				p.count(count);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
//				break;
//			}	
		}
		else if(x.equals("b")){
			System.out.println("1.add doctor");
			System.out.println("2.display doctor");
			int c=s.nextInt();
//			switch(c) {
//			case 1:
				doctor d=new doctor();
				try {
				d.get();
				File fd=new File("file_doctor.txt");
				FileOutputStream fod=new FileOutputStream("file_doctor.txt",true);
				
				if(fd.length()<0) {
					ObjectOutputStream oo=new ObjectOutputStream(fod);
					oo.writeObject(d);
					}else {
					Apendable aa=new Apendable(fod);
					aa.writeObject(d);
					}
				System.out.println("...Successfully added doctor's record...");
			}catch(Exception e) {System.out.println(e);}
//			break;
//			case 2:
				try {
				ObjectInputStream oid=new ObjectInputStream(new FileInputStream("file_doctor.txt"));
				int count1=0;
			
				do {
					d=(doctor) oid.readObject();
					count1++;
					d.show();
					
				}while(d!=null);
				}catch(Exception e) {}
//				d.count1(count1);
//				oid.close();
//				break;
//		     }
			
		}


		
	
	}

}

