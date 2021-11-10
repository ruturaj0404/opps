package collection;
/*
 * Q define a class Jobseeker having fields like id,name,branch
 
-- Define  parameterized constructor ,toString and compareTo method
 
create anothr class JObMain having main method
create 5 record store them to TreeSet
 */

public class JobSeaker implements Comparable<JobSeaker> {
	String name,branch;
	int id;
	
	@Override
	public int compareTo(JobSeaker o) {
		 if   (id>o.id)      return 1;//return positive
		 else if(id<o.id)    return -1;//return negative 
		 else return 0;
		
	}

	public JobSeaker(String name, String branch, int id) {
		super();
		this.name = name;
		this.branch = branch;
		this.id = id;
	}

	@Override
	public String toString() {
		return "JobSeaker [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	

}
