package classes_and_constrctor_lab;

public class Electronic extends Toy {
	int model_no;
	int ref;
	Electronic(int m,int r){
		model_no=m;
		ref=r;
		
	}

		void printall() {
			System.out.println(model_no+" "+ref);
		}

		public static void main(String[] args) {
			 Electronic e=new Electronic(10,5);
			 e.printall();
			 Toy t=new Toy("abc",100);
			 t.display();
			 t.staticdisplay();
			 
			 new Toy();
			
		}
		
	}


