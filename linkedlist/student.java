package linkedlist;

public class student {
	String name;
	int id;
	int marks;
	
	student (String n,int i,int m){
		this.name=n;
		this.id=i;
		this.marks=m;
		
	}
	public String toString() {
		return name+" "+id+" "+marks;
		}
}
