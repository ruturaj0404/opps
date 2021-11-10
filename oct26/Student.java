package oct26;
import java.io.Serializable;
public class Student implements   Serializable {
	String name;
	String id;
	  Student(String n,String i){
		  name=n;
		  id=i;
		
	}
	  void display() {
		  System.out.println(name+" "+id);
	  }
	
}
