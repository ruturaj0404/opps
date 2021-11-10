package Day1;

import java.io.Serializable;

public class Student implements  Serializable {
 public String Name;
int rollno;
public Student(String name, int rollno) {
	
	Name = name;
	this.rollno = rollno;
}

@Override
public String toString() {
	return "Student [Name=" + Name + ", rollno=" + rollno + "]";
}

}
