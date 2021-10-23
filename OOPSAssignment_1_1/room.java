package OOPSAssignment_1_1;

public class room {
	int roomNo;
	String roomType;
	float roomArea;
	boolean ACmachine;
	void setdata(int rno,String rt,float ra,boolean ac) {
	  roomNo=rno;
	  roomType=rt;
	  roomArea=ra;
	  ACmachine=ac;
	 	
	}
 void displaydata() {
	  System.out.println("room No"+roomNo);
	  System.out.println("room Type"+roomType);
	  System.out.println("room Area"+roomArea);
	  System.out.println("room No"+roomNo);
	  String s=(ACmachine)? "yes":"no";
	  System.out.println("AC machine needed="+s);
	  
 }
 public static void main(String []args) {
	 room r=new room();
	 r.setdata(123,"delux", 1020,true);
	 r.displaydata();
	 
 }

}
