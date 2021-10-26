package oct25;
//wap to read file data and print it on console using filereader 
import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException ,FileNotFoundException  
	{try
	{ 
	 	    FileReader f= new FileReader("E:\\p21.txt");
	        int i;
		    do 
		    {
		    	i= f.read();
		    	if(i!=-1)   System.out.print ((char)i);
			 
		    	}while(i!=-1);
			
			
			
				
	}catch(Exception s) {System.out.println(s);}
	}

}