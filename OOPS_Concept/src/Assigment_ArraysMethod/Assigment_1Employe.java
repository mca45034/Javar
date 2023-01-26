package Assigment_ArraysMethod;

public class Assigment_1Employe {
	int e_id;
	String e_name;
	Department d;
	public Assigment_1Employe(int e_id, String e_name, Department d) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Assigment_1Employe [e_id=" + e_id + ", e_name=" + e_name + ", d=" + d + "]";
	}
	
	

}
