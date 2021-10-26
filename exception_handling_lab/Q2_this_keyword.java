package exception_handling_lab;
class student{
	int rollno;
	String name;
	
    void record (int rollno,String name) {
  	this.rollno=rollno;
  	this.name=name;
  	
   }
    void display() {
    	System.out.println(rollno+" "+name);
    }
}
    
public class Q2_this_keyword {
	public static void main(String args[]) {

	student s1=new student();
	s1.record(1,"ruturaj");
	s1.display();
	
	}
    
}

