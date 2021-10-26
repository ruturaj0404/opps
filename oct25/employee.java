package oct25;
import java.io.*;



public class employee {



public static void main(String[] args)throws IOException 
{
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter name age and salary ");
String name=b.readLine();
int age= Integer.parseInt(b.readLine());
float salary = Float.parseFloat(b.readLine());
System.out.println(name+" "+age+" "+salary);



}



}
