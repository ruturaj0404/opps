package classes_and_constrctor_lab;

public class staticdemo {
	
        int num1 = 6;
        static int num2 = 10;

  public static void main(String args[]) {
        staticdemo s1 = new staticdemo();
        staticdemo s2 = new staticdemo();
        s2.num2 = 30;
        s1.num1 = 15;
        s1.num2 = 17;
        s2.num1 = 22;
        
        System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " "+ s2.num2);
        /*You have created two objects and s1,s2 are the references. 
        s1.num1=15 assigns value 15 to num1 variable, 
        It doesn’t updates the value in s2 reference. s1.num2=17 assigns value 17 to num2 variable , 
        it updates the value in s2 reference also because num2 is a static variable. s2.num1=22 assigns value 22 to num1 variable, 
        It doesn’t updates the value in s1 reference. s2.num2=28 assigns value 28 to num2 variable ,
        it updates the value in s1 reference also because num2 is a static variable.*/
}
}


