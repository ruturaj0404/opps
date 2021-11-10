package IOLab;
/*
 * Create LMS application
 

b) create class book having filed like bname,aname and prize 
c) create getdata
d)displaydata
e) count data 
f)Store all information in file "book.ser"
g) read all data from file and display it on console
h) count number of books in file
 */


import java.util.Scanner;

import java.io.*;

public class book implements   Serializable
{
String Bname;
String aname;
int price;
void getdata() {
	Scanner s=new Scanner(System.in);
	  System.out.println("enter book name");
	  Bname=s.nextLine();
	  System.out.println("enter auther name");
	  aname=s.nextLine();
	  System.out.println("enter book price");
	  price=s.nextInt();
}
void display() {
	System.out.println("book name: "+Bname);
	System.out.println("auther name: "+aname);
	System.out.println("book price: "+price);
	
}
void record(int c) {
	
System.out.println("count of books="+c);
} 
}
