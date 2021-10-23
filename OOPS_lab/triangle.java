package OOPS_lab;

public class triangle {
	
	static void tri(int x, int y, int z) {
		if (x >= y + z || y >= x + z || z >= x + y)
		System.out.println("Not a Triangle!");
		else if (x == y && x == z)
		System.out.println("Equilateral Triangle!");
		else if (x != y && y != z)
		System.out.println("Scalene Triangle!");
		else
		System.out.println("Isosceles Triangle!");
		}
		public static void main(String[] args) {
		tri(50,70,90);
		}
	}


