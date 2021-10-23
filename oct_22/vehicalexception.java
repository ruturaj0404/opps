package oct_22;

public class vehicalexception extends Exception {
	//constructor
	//paramterized constructor
	//public String getMessage(){}
	public vehicalexception(){
		System.out.println("car");
	}
	vehicalexception(String x){
		System.out.println("car no="+x);
	}
	public String getMessage() {
		return "abc";
	}
		
}
