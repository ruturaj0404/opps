package OOPSAssignment_1_1;
//Q 6 wap to perform addition of two three and fourth integer numbers using functions 
//(use polymorphism)

public class question_6 {
	void add(int a, int b) {
		System.out.println("Adding 'a' and 'b' = " + (a + b));

	}

	void add(int a, int b, int c) {
		System.out.println("Adding 'a', 'b' and 'c' = " + (a + b + c));

	}

	void add(int a, int b, int c, int d) {
		System.out.println("Adding 'a', 'b', 'c', and 'd' = " + (a + b + c + d));

	}

	public static void main(String[] args) {
		question_6  p = new question_6 ();
		p.add(1, 2);
		p.add(1, 2, 3);
		p.add(1, 2, 3, 4);

	}

	

}
