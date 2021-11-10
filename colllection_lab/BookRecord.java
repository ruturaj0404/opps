package colllection_lab;
import java.util.*;
/*
 * Q 3 Write program for maintaining book record of library .
use ArrayList Class to hold an multiple book record and display all book record using iterator .
b) traverse arraylist and store each book record in class object and display book name 
 */
class book {
	String name;
	int price;
	public book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [name=" + name + ", price=" + price + "]";
	}
	
}
public class BookRecord {

	public static void main(String[] args) {
		book b= new book("java",100);
		book b1= new book("cpp",1100);
		book b2= new book("c++",5100);
		
		ArrayList<book> a=new ArrayList<book>();
		a.add(b);
		a.add(b1);
		a.add(b2);
		
		Iterator<book> i= a.iterator();
		while (i.hasNext())
			System.out.println(i.next().name);
		
	}

}
