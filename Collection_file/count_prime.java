package Collection_file;

public class count_prime {

	public static void main(String[] args) {
		
	int i,j,p;
	
		 
		int a[]= {10,2,3,85,63,98,74,65,14,23,1};
		 for ( i = 0; i <a.length; i++) {
	           j=2;
	            p = 1;
	            while (j < a[i]) {
	                if (a[i] % j == 0) {
	                    p = 0;
	                   
	                    break;
	                }
	                j++;
	               
	            }
	            if (p == 1) {
	            	
	                System.out.println("prime no in list :\n"+a[i]);
	            }
	        }
	}   
}
