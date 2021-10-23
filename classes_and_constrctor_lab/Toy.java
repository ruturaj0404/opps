package classes_and_constrctor_lab;
/*
 create a class Toy having variable toyname ,price,and static variable "madein" .
create no arg and parameterized constructor to initialize class variables .
Define static function staticdisplay and non static method display 

--display() print class non static variable 
--staticdisplay print static variable

create another class ElectronicToy which has fileds like modelno and Toy reference .
create parametrized constructor to initialize both variables.
In Elctronic Class define printAll function that print all values of same class as well as call toy class static and non static functions .
*/
public class Toy {
	String toy_name;
	int price;
	static String madein="india";
	Toy(){
		System.out.println("no arg");
	}
	Toy(String t,int p){
		toy_name=t;
		price=p;
	}
	void display() {
		System.out.println(toy_name+" "+price);
	}
	static void staticdisplay() {
		System.out.println(madein);
	}

}
