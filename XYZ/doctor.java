package XYZ;

import java.io.*;

import java.util.Scanner;

public class doctor implements Serializable {

	
	String dname,specilization,address;
	int regno;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	void get() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter doctor name");
		dname=s.nextLine();
		System.out.println("Enter doctor address");
		address=s.nextLine();
		System.out.println("Enter doctor regno");
		regno=s.nextInt();
		System.out.println("Enter doctor specilization");
		specilization=s.nextLine();
		setDname(dname);
		setAddress(address);
		setRegno(regno); 
		setSpecilization(specilization);
	}
void show() {
	
	
	System.out.println(getDname());
	System.out.println(getAddress());
	System.out.println(getRegno());
	System.out.println(getSpecilization());
	
}
void count1(int count) {
	System.out.println("no of doctor:"+count);
}
}
