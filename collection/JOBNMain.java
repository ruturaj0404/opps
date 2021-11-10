package collection;
import java.io.*;
import java.util.*;
public class JOBNMain {

	public static void main(String[] args) {
		JobSeaker j=new JobSeaker("rutu","punr",123);
		JobSeaker j1=new JobSeaker("raj","mumbai",896);
		JobSeaker j2=new JobSeaker("amol","nashil",2843);
		JobSeaker j3=new JobSeaker("akash","satra",98723);
		JobSeaker j4=new JobSeaker("om","karad",12);
		TreeSet t=new TreeSet();
		t.add(j);
		t.add(j1);
		t.add(j2);
		t.add(j3);
		t.add(j4);
		System.out.println(t);
	}

}
