package Collection_file;

import java.util.*;

class ticket1 {
 String disc; int id , prino;

public ticket1(int prino, int id, String disc) {
	super();
	this.prino = prino;
	this.id = id;
	this.disc = disc;
}

@Override
public String toString() {
	return "ticket [prino= " + prino + ", id= " + id + ", issue= " + disc + "]";
}
	
}
 class ticketComparator implements Comparator<ticket1>
 {

	@Override
	public int compare(ticket1 o1, ticket1 o2) {
		return  o1.prino - o2.prino;
	}
	 
 }


 public class Ticket{
	 
	 public static void main(String []  args)
	 {
		 ticket1 t= new ticket1(3, 56666, "System Error"); 
		 ticket1 t1= new ticket1(4, 46666, "Network Error");
		 ticket1 t2= new ticket1(2, 56866, "Power Supply error");
		 ticket1 t3= new ticket1(5, 76666, "observational error");
		 ticket1 t4= new ticket1(6, 66666, "gross error");
		 ticket1 t5= new ticket1(1, 86666, "human error");
		 
		 ticketComparator tc= new ticketComparator();
		 
		 PriorityQueue<ticket1> pr =new PriorityQueue<ticket1>(tc);
		    pr.add(t);pr.add(t5);
		    pr.add(t1);
		    pr.add(t2);
		    pr.add(t3);
		    pr.add(t4);
		    Iterator it =pr.iterator();
		    while(it.hasNext())
		    	 System.out.println(it.next());
		  
		    
	 } 
	 
 }
