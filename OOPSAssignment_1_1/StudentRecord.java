package OOPSAssignment_1_1;


class StudentRecord {
	String sname;
	int roll_no;


void display() {
	System.out.println("student name "+sname+"\nroll no"+roll_no);
}

	public static void main(String[]args) {
		StudentRecord s= new StudentRecord();
		s.sname="John";
		s.roll_no=2;
		s.display();
		
		
	}
}

	
