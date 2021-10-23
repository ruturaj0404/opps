package inhertancelab;

import java.util.Scanner;

public class UseOrder {
	public static void main(String []args) {
		
		ShippedOrder s=new ShippedOrder();
		
		s.setName("rutu");
        s.setCo_no(500);
		s.setOrder_qty(2);
		s.setUnit_cost(5);
		System.out.println(s.getName());
		System.out.println(s.getCo_no());
		System.out.println(s.getUnit_cost());
		System.out.println(s.getOrder_qty());
		System.out.println(s.computeprice());
	}


}
