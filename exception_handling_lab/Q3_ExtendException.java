package exception_handling_lab;

public class Q3_ExtendException extends Exception {

	 public Q3_ExtendException (String m)
	 {
		 super("speed limit violation occur");
		 System.out.println(m);
	 }

}