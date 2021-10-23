package OOPS_lab;

public class Bank {
	int Acc_no;
	String name;
	float Acc_Bal;
	static int bank_ifsc=12334;
	static String bank_name="ICIC";
		class saving_acc{
			float saving_intr;
			void get_data() {
				Acc_no=123456;
				name="Ruturaj";
				Acc_Bal=10000;
				saving_intr=6;
			}
			void show_data() {
				System.out.println(Acc_no+"\n"+name+" \n"+Acc_Bal+" \n"+saving_intr);
			}
		}
			static class Banner{
				void show() {
					System.out.println(bank_name+" \n"+bank_ifsc);
				}
			}
		

	public static void main(String[] args) {
		Bank b=new Bank();
		Bank.saving_acc s=b.new saving_acc();
		s.get_data();
		s.show_data();
		
		Bank.Banner b2= new Bank.Banner();
		b2.show();

	}

}
