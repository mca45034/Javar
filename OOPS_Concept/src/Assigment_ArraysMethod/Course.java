package Assigment_ArraysMethod;

public class Course {
	String cname;
	int fees;
	public Course(String cname, int fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}




	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + "]";
	}
}