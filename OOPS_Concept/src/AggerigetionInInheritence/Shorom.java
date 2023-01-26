package AggerigetionInInheritence;

public class Shorom {
	String s_name;
	String s_location;
	int s_contect;
	Clothes c;
	public void setS_name(String s_name) {
		this.s_name=s_name;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_location(String s_location) {
		this.s_location=s_location;
	}
	public String getS_location () {
		return s_location;
	}
	public void setS_contect(int s_contect) {
		this.s_contect=s_contect;
	}
	public int getS_contect() {
		return s_contect;
	}
	public void setC(Clothes c) {
		this.c=c;
	}
	public Clothes getC() {
		return c;
	}
	@Override
	public String toString() {
		return "Shorom [s_name=" + s_name + ", s_location=" + s_location + ", s_contect=" + s_contect + ", c=" + c
				+ "]";
	}
	

}
