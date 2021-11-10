package colllection_lab;
import java.util.*;
/*
 * Q 1 write a program to create vector of string and add elements to vector 
check vector class main functions like 
1)adding elements in vector
2)traversing all vector elements 
3)print vector object hashcode
4)get particular element value usin get function
5)print size and capacity of vector
6)add null data in vector
7)print index valueof null elements 
hint v.indexOf(null)
8)add element at particular postition
hint 
v.insertElementAt("",5);
9)remove particular element from vector
 */
public class vector_lab {

	public static void main(String[] args) {
	
		Vector <String> v= new <String>Vector();
//1)adding elements in vector
		v.add("rutu");
		v.addElement("noida");
		v.add("rajesh");
		v.addElement("pune");
//2)traversing all vector elements
		Iterator<String> i=v.iterator();
		System.out.println("vector elements are :");
		while(i.hasNext())
			System.out.println(i.next());

//3)print vector object hashcode
		System.out.println("hashcode :"+v.hashCode());
		
		System.out.println("\nget element on index 3 :"+ v.get(3));
		
		System.out.println("Size of vector  :" +v.size());
		System.out.println("capacity of vector  :"+v.capacity());
		v.add(null);
		System.out.println("\nupdated vector elements are :");
		Iterator<String> i1=v.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println("\nindex of null :"+v.indexOf(null));
		System.out.println("adding john at index of 5");
		v.add(5,"john");
		System.out.println("\nremoving element from index 3");
		v.remove(3);
		
		System.out.println("\nupdated vector elements are :");
		Iterator<String> i12=v.iterator();
		while(i12.hasNext())
			System.out.println(i12.next());
		System.out.println("\nSize of vector  :"+v.size());
		

	}

}
