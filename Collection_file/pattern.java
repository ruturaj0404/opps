package Collection_file;

public class pattern {

	public static void main(String[] args) {
		for (int i=0; i<4; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=4-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop to handle number of columns
            //  values changing acc to outer loop
            for (int j=0; j<=i; j++ )
            {
               
                System.out.print("$  ");
            }
  
            // ending line after each row
            System.out.println();
        }
    }
	}


