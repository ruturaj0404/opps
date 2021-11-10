package oct26;
import java.io.*;
 class Apendable extends ObjectOutputStream{
	public Apendable(OutputStream a) throws IOException{
		super(a);
	}
//	@Override
	protected void writeStreamHeader() {}
}
public class studentrecord {

	public static void main(String[] args) throws Exception{
	
		Student e= new Student ("anu","64");
		File fi= new File("emprec2.txt");
		 FileOutputStream f= new FileOutputStream("emprec2.txt",true);
		 if(fi.length()<=0)
		 {

			 ObjectOutputStream o= new ObjectOutputStream(f);
			 o.writeObject(e);// calls writeStreamHeader 
		 }
		 
		 else
		 {
			Apendable o= new Apendable(f);
			 o.writeObject(e); 
		 }
		 try {
		 //reading data from file 
		 FileInputStream f1=new FileInputStream ("emprec2.txt");
		 ObjectInputStream oi= new ObjectInputStream(f1);
		 do
		 {
		   e=(Student)oi.readObject();
		   e.display();
		 }while(e!=null);
		 f.close();
		}catch(Exception e1)
		{
			System.out.println(" thankyou! ");
		}
	}
}

