package OOPS_lab;

public class oddeven {

	public static void main(String[] args) {

		int [] num = {1,2,3,4,5}; 
	
		int points = 0;
		for(int i=0; i<num.length;i++) {
			if(num[i] == 5 ) {
				points += 5;
			}
			else if(num[i]%2==0) points+=1;
			else points+=3;
				
			}
			System.out.println("points " + points);
		}
		
          
	
	}


