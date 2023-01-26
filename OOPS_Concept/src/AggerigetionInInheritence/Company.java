package AggerigetionInInheritence;

public class Company {
	String c_name;
	String c_department;
	Employe e;
	static String c="-----WELCOME TO COMPANY-----";

	public void setC_name(String c_name) {
		this.c_name=c_name;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_department(String c_department) {
		this.c_department=c_department;
	}
	public String getC_department() {
		return c_department;
	}
	public void setE(Employe e) {
		this.e=e;	
	}
	public Employe getE() {
		return e;
	}
	@Override
	public String toString() {
		return c_name+" "+c_department+" "+e;
	}
	
	
	}


