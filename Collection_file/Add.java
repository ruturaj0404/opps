package Collection_file;

public class Add {
	
	void add(int ...x) {
		int sum=0;
		for(int u:x) 
		sum+=u;
		System.out.println("sum:"+sum);
	}

	public static void main(String[] args) {
		Add a=new Add();
		a.add(8,56,54);
		
	}

}
