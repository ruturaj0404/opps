package exception_handling_lab;

public class Q7_user_exception extends Exception {
	public Q7_user_exception() {
		super("internal marks exceed !");
		
	}
	public Q7_user_exception(String s) {
		super("external marks exceed !");
//		System.out.println(s);
	}
}
