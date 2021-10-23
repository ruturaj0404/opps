package constructor_inheritsnce;

public class test2 extends test1 {
	void show() {
		System.out.println("hello1");
		 super.show();
	}
	public static void main(String[]args) {
		test2 t=new test2();
	   t.show();
	  
	}

}
