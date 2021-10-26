package oct25;
import java.io.*;
public class WritertoFile {
	public static void main(String [] a) throws Exception {
		 
		FileReader fr=new FileReader("E:\\p2.txt");
		FileWriter r= new FileWriter("E:\\p3.txt");
		File f=new File("e://p2.txt");
		long len= f.length();
		char c[]= new char[(int)len];
		fr.read(c);
		
		r.write(c);
		fr.close();
		r.close();
	}

}
