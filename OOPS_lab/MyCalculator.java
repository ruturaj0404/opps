package OOPS_lab;

interface Signature {
int divisor_sum(int n);
}
public class MyCalculator implements Signature{
	public int divisor_sum(int n) {
		  if (n <= 1) { return n; }
	        int res = n + 1;
	        for (int i = 2; i < n; i++) {     
	            if (n % i == 0) 
	            {
	                res += i;
	            }
	        }
	        return res;
	}
	
	 public static void main(String []args){
		 
		    MyCalculator m= new MyCalculator();
		    System.out.println(m.divisor_sum(10));
		    
		     }

}
