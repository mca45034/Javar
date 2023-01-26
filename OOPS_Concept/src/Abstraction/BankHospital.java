package Abstraction;
abstract  class Bank{
	String name="Rahul Kirar";
	int age=23;
	int AccountNo=5536363;
	public void CustamreDetails() {
		System.out.println("Custamre name is .."+name);
		System.out.println("Customare Age is..."+age);
		System.out.println("Customare Account Number is..."+AccountNo);
	}
	abstract public void BloodGroup ();
	abstract public void EmployeDepart ();
}
class Hospital extends Bank{
	String b="A+";
	String d="IT";

	@Override
	public void BloodGroup() {
		System.out.println("Customare Blood Group is..."+b);	
	}

	@Override
	public void EmployeDepart() {
		System.out.println("Employee deaprtment is..."+d);
		
	}
	
}

public class BankHospital {

	public static void main(String[] args) {
		Bank b=new Hospital();
		b.CustamreDetails();
		System.out.println("-----------------------");
		b.BloodGroup();
		System.out.println("------------------------");
		b.EmployeDepart();
		

	}

}
