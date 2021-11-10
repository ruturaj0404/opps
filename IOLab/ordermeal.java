package IOLab;
import java.io.*;

import java.util.Scanner;

class order implements Serializable {
	String name;
	String Add;
	String contactid;
	int menu;
	
	void getdata() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		name=s.nextLine();
		System.out.println("enter yoour Add");
		Add=s.nextLine();
		System.out.println ("Enter contact no");
		contactid=s.nextLine();
		System.out.println("select your menu");
		
		System.out.println("1.veg");
		System.out.println("2.nonveg");
		System.out.println("3.ice-cream");
		System.out.println("select your menu");
		menu=s.nextInt();
		switch(menu){
		case 1 : System.out.println("veg meal ordered");
		break;
		case 2:System.out.println("non-veg meal ordered");
		break;
		case 3: System.out.println("veg meal ordered");
		break;
		default :
			System.out.println("select valid menu !");
			
		}
	}
	void display() {
		System.out.println("hotel name "+name);
		System.out.println("delivary Add "+Add);
		System.out.println("mobile no "+contactid);
		
		
	}
}
	
	public class ordermeal {
	public static void main(String[] args)  throws Exception{
		
		order o=new order();
		o.getdata();
		File f=new File("order12.txt");
		
		FileOutputStream fo=new FileOutputStream("order12.txt");
		if(f.length()<=0) {
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(o);
			
		}else {
			Apendable o1=new Apendable(fo);
			o1.writeObject(o);
			
		}
		try {
		FileInputStream fi=new FileInputStream("order12.txt");
		ObjectInputStream oi= new ObjectInputStream(fi);
		 do
		 {
		   o=(order)oi.readObject();
		   o.display();
		 }while(o!=null);
		 fi.close();
		}catch(Exception e1){}
		
		
	}

}


