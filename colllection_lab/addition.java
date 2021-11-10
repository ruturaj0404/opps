package colllection_lab;
import java.util.*;
//Q 2 Write a java program to add even numbers from 1 to 20 in vector 
public class addition {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(); 
		 for(int i = 0; i <= 20; i++)
		 { 
		  if(i % 2 == 0)
		  { 
		    v.add(i); 
		    
		   } 
		 
		
	}
		 Integer [] array = v.toArray(new Integer[v.size()]);
		 System.out.println("Array: "+ Arrays.toString(array));
		 Iterator<Integer> it = v.iterator();
		 int sumEven=0;
		 for(int a=0;a<array.length;a++) {
			 sumEven = sumEven+array[a];
		 }
		 System.out.println(sumEven);
}
}