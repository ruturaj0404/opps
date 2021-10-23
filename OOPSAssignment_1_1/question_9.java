package OOPSAssignment_1_1;
//Q 9 Write a JAVA program which contains a method fun() such that fun(x) returns x2
//and fun(x,y) 
//returns x2 + y2
//. (where x and y are integers). 

public class question_9 {

	
		int function(int a) {
			return 2 * a;
		}

		int function(int a, int b) {
			return 2 * a + 2 * b;
		}

		public static void main(String[] args) {
			question_9 f = new question_9();
			System.out.println("2*X="+f.function(5));
			System.out.println("2*X+2*Y="+f.function(5, 10));


	}

}
