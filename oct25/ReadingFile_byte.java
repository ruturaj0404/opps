package oct25;
//wap to read content of file and store it to byte array 
import java.io.*;

public class ReadingFile_byte {

	public static void main(String[] args) throws Exception
	 {
    
		FileInputStream  fs= new FileInputStream("e://p2.txt");
      //what should be the array size 
		File f= new File("e://p2.txt");
		long len= f.length();
		byte b1[]= new byte[(int)len];
      fs.read(b1);
      for(int r:b1)
      System.out.print((char)r);

	}

}
