package Collection_file;
/*
 * Q Write a java code that store student name and rollno and check if particular rollno is their in hash map or not .
 * If it is avaialbel print found else not found 
 */
import java.util.*;
import java.util.Map.Entry;

public class hash_map {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("raj", 201);
		hm.put("om", 202);
		hm.put("rajesh", 203);
		System.out.println(hm);
		
//		Iterator<Entry<String, Integer>> it= hm.entrySet().iterator();
//		while(it.hasNext()) {
//			Entry<String, Integer> record=it.next();
			if(hm.containsKey("om")) {
				System.out.println("record found");
			}else System.out.println("record not found");
			
			
		}
		
		}
		
		
//	}


