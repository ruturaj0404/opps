package IOLab;

import java.io.*;

public class read_write {
public static void main(String[] args){
	try
	{
		FileReader fr= new FileReader("read.txt");
	File f1=new File("read.txt");
	FileWriter f=new FileWriter("write.txt");
	long len= f1.length();
	char c[]= new char[(int)len];
int count=0;

	fr.read(c);
	count++;
	System.out.println(c);

System.out.println(count);
	f.write(c);
	System.out.println("Data read from read.txt and write on write.txt successfully !");
	f.close();
	fr.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
