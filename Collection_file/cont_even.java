package Collection_file;

public class cont_even {

	public static void main(String[] args) {
int count=0;
		int a[]= {10,65,978,85,63,98,74,65,14,23};
		System.out.println("list of even no in array");
		 for(int x=0; x<a.length;x++) {
			 if (a[x]%2==0) {
				 System.out.println (a[x]);
				 count++;
			 }
		 }
System.out.println("total couynt of even no in this array : "+count);
	}

}
