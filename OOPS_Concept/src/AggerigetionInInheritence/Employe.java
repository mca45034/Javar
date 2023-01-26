package AggerigetionInInheritence;

public class Employe {
	String e_name;
	int e_id;
	String e_department;
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_department() {
		return e_department;
	}
	public void setE_department(String e_department) {
		this.e_department = e_department;
	}
	@Override
	public String toString() {
		return e_name+" "+e_id+" "+e_department;
	}
	

}
