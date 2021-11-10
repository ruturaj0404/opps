package Collection_file;
import java.util.*;
public class linkedlist_compare {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("red");
		l.add("Green");
		l.add("White");
		l.add("Yellow");
		l.add("gray");
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Red");
		l1.add("red");
		l1.add("Green");
		l1.add("White");
		
		LinkedList<String> l3=new LinkedList<String>();
		for(String e:l) 
			l3.add(l1.contains(e) ? "Yes" : "NO");
			System.out.println(l3);
			
			System.out.println(l.containsAll(l1));
		
	}

}
