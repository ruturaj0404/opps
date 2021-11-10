package IOLab;

import java.io.*;

class Apendable extends ObjectOutputStream{
	public Apendable(OutputStream a) throws Exception{
		super(a);
	}
//	@Override
	protected void writeStreamHeader() {}
}

public class bookrecord {

	public static void main(String[] args)throws Exception {
		try {
	book b=new book();
b.getdata();
  File fi= new File("book.txt");
	 FileOutputStream f= new FileOutputStream("book.txt",true);

	 if(fi.length()<=0)
	 {
		 @SuppressWarnings("resource")
		ObjectOutputStream o= new ObjectOutputStream(f);
		 o.writeObject(b); 
	 } else
		 
	 {
		Apendable o= new Apendable(f);
		 o.writeObject(b); 
	 }
	 
	 
	
		
		 ObjectInputStream oi= new ObjectInputStream(new FileInputStream ("book.txt"));
		 int count=0;
		 do
		 {
		   b=(book) oi.readObject();
		   count++;
		   b.display();
		   b.record(count);
		 }while(b!=null);
		 
		 oi.close();
	
		}catch(Exception e1)

		{
			System.out.println(" thankyou! ");
		}
	
	
	 		
	 
	}
}
