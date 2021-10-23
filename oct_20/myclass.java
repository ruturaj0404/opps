package oct_20;

public class myclass {
	void tester() {
		class callTest implements junittest{
			public void test1() {System.out.println("test1");}
			public void test2() {System.out.println("test2");}
		
		}
		callTest t=new callTest();
		t.test1();
		t.test2();
	}
	void testanonymus() {
		junittest j=new junittest() {
			public void test1() {System.out.println("test3");};
			public void test2() {System.out.println("test3");};
		};
		j.test1();
		j.test2();
	}
	


	public static void main(String[] args) {
	myclass m= new myclass();
m.tester();
m.testanonymus();
}
}
	
