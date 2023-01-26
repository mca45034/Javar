package Assigment_14JAN;

public class Employe {
	int e_id;
	String e_name;
	int e_salary;
	public Employe(int e_id, String e_name, int e_salary) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
	}
	@Override
	public String toString() {
		return "Employe [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + "]";
	}
	

}
