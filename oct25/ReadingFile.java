package oct25;
//wap to read data from file and store it in character array 
import java.io.*;

public class ReadingFile {

	public static void main(String[] args)
	
	{
	try
	{
		FileReader fr= new FileReader("E:\\p2.txt");
		char c[]= new char[100];
		fr.read(c);
		System.out.println(c);
		
		
	}catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
