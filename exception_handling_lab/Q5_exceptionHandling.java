package exception_handling_lab;

public class Q5_exceptionHandling {

	public static void main(String[] args)throws Exception {
		try {
			if (args.length==0) {throw new Exception();}
				System.out.println("args "+ args[0] );
			
				
		} catch (Exception e) {
			System.out.println(e.toString());
		
		} finally {
			System.out.println("finally");
		}
	}


}

