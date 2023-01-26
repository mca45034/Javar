package AggerigetionInInheritence;

public class Cafe {
	String c_name;
	String c_fecility;
	int c_charge;
	Customer c;
	public void setC_name(String c_name) {
		this.c_name=c_name;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_fecility(String c_fecility) {
		this.c_fecility=c_fecility;
	}
	public String getC_fecility() {
		return c_fecility;
	}
	public void setC_charge(int c_charge) {
		this.c_charge=c_charge;
	}
	public int getC_charge() {
		return c_charge;
	}
	public void setC(Customer c) {
		this.c=c;
	}
	public Customer getC() {
		return c;
	}

}
