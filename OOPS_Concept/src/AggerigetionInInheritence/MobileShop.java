package AggerigetionInInheritence;

public class MobileShop {
	String name;
	int s_number;
	String d_name;
	Mobile m;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setS_number(int s_number) {
		this.s_number=s_number;
	}
	public int getS_number() {
		return s_number;
	}
	public void setD_name(String d_name) {
		this.d_name=d_name;
	}
	public String getD_name() {
		return d_name;
	}
	public void setM(Mobile m) {
		this.m=m;
	}
	public Mobile getM() {
		return m;
	}
	public String toString() {
		return name+" "+s_number+" "+d_name+" "+m;
	}

}
