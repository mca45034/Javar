package Assigment_ArraysMethod;

public class Department {
	int depid;
	String depname;
	public Department(int depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + "]";
	}
	

}
