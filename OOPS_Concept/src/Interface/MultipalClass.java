package Interface;
interface tax{
	public static final int a=20;
	public abstract void payTax();
}
interface loan{
	void loanFacility();
}
class Employee implements tax,loan{

	@Override
	public void loanFacility() {
		System.out.println("Employee pying loan");
		
	}

	@Override
	public void payTax() {
		System.out.println("Employee payind tax");
		
	}
}
	class Mane implements tax{

		@Override
		public void payTax() {
			System.out.println("Man is paying tax");
			
		}
		
	
	
}

public class MultipalClass {

	public static void main(String[] args) {
		tax t;
		t=new Employee();
		t.payTax();
		t=new Mane();
		t.payTax();

	}

}


