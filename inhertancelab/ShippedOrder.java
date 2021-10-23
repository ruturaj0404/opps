package inhertancelab;

public class ShippedOrder extends order {
	private int shipping=40;
	
	public double computeprice()
	{
		double order_cost=getOrder_qty()*getUnit_cost()+shipping;
		return order_cost;
	}
}
