package Assigment_14JAN;

public class Department {
	int did;
	String dname;
	MyDate d;
	Employe e;
	public Department(int did, String dname, MyDate d, Employe e) {
		super();
		this.did = did;
		this.dname = dname;
		this.d = d;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", d=" + d + ", e=" + e + "]";
	}

}
