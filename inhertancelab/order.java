package inhertancelab;

public class order {
	private String name;
	private int cust_no;
	private double order_qty;
	private double unit_cost;
	
	public int getCo_no() {
		return cust_no;
	}
	public void setCo_no(int co_no) {
		this.cust_no = co_no;
	}
	public double getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(double order_qty) {
		this.order_qty = order_qty;
	}
	public double getUnit_cost() {
		return unit_cost;
	}
	public void setUnit_cost(double unit_cost) {
		this.unit_cost = unit_cost;
	}
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	double computeprice() {
		double cost=((order_qty)*(unit_cost));
		return cost;
	}
		

}
