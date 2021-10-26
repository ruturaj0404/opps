package exception_handling_lab;
class Shape {
	int dim1, dim2;

	public void setDim(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
}

class Circle extends Shape {

	float areaOfCircle() {
		return ((float)22 / 7) * dim1 * dim1;
	}
}

class Rectangle extends Circle {
	
	float areaOfRectangle() {
		return (float) dim1 * dim2;
	}
}

public class Q4_shape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		
		r.setDim(5, 6);
		System.out.println("Area of Circle " + r.areaOfCircle());
		System.out.println("Area of Rectangle " + r.areaOfRectangle());

	}



}
