package incapsulation;

public class CustomerPayment {

	public static void main(String[] args) {
		Custmer c=new Custmer();
		c.setC_id(10122);
		c.setBalance(200000);
		c.setAcc_no(8120213);
		System.out.println(c.getC_id());
		System.out.println(c.balance);
		System.out.println(c.getAcc_no());
		int m=c.getBalance()+500;
		c.setBalance(m);
         System.out.println("added amount");
         System.out.println("Current balance="+c.getBalance());
	}

}
