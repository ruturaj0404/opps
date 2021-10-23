package OOPSAssignment_1_1;

 class simpleobject {
	simpleobject(){
		System.out.println("constructor wih no argument");
	}
	simpleobject(int a){
		System.out.println("Constructor with single argument");
	}
	
	public static void main(String[]args) {
		new simpleobject();
		new simpleobject(10);
	}
}

