package IOLab;
import java.io.*;
public class file_length  {
	  public static void main(String a[]) throws Exception {

		  File f=new File("read.txt"); 
		try (InputStream reader= new BufferedInputStream(new FileInputStream(f));){
		  int count=0;
//		  String x= reader.readLine();
		 byte [] words = new byte [100];
		  while ((count = reader.read(words)) != -1) {
              for (int i = 0; i <count; ++i) {
                  if (words[i] == '\n')
                      ++count;
              }		  
		  System.out.println("count of words= "+count);
		  
	  }
		}catch(Exception e) {
			  System.out.println(e);
			  e.getMessage();
		  }
	  }
}
