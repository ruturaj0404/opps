package IOLab;
import java.io.*;
public class Enter_q_to_exit  {

	public static void main(String[] args) throws Exception {
		char chr;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter charachters, press---->'q' to exit from write mode!");
		do {
		chr=(char)br.read();
		System.out.println(chr);
		}while(chr!='q');

	}

}
