package IOLab;
import java.io.*;
import java.util.*;
public class check_properties {

	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		p.setProperty("email", "ruturaj209@gmail.com");
		p.setProperty("pass","@123");
		p.store(new FileWriter("properties.txt"),"login credentials");
		FileReader fr=new FileReader("properties.txt");
		System.out.println(p.getProperty("email"));
		System.out.println(p.getProperty("pass"));
	}

}
