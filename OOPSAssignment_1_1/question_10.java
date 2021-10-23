package OOPSAssignment_1_1;
//Write a set of overloaded methods min() that returns the smaller of two numbers passed to 
//them as arguments. Make versions for int and float. 

public class question_10 {
	 int min(int x,int y) {
		if(x<y) { 
			
		System.out.println("x is smaller than y");
		return x;
		}else { 
				System.out.println("x is greater than y");
				return y;	}
			}

	public static void main(String[] args) {
		question_10 a=new question_10();
		System.out.println(a.min(15,8));
	}

}
