package colllection_lab;
import java.util.*;


//Q 5 Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
public class TreeSetLab {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("red");
		t.add("yellow");
		t.add("white");
		t.add("black");
		Iterator<String> i = t.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
		
		
	}

}
