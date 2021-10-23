package oct_22;

public class vehicalrecord {

	static void checkSpeed(int s) throws vehicalexception
	{
		// check if speed greater then 180 throw exception
		if(s<180) throw new vehicalexception();
	
	}
	public static void main(String[] args) throws vehicalexception {
		checkSpeed(120);

	}

}
