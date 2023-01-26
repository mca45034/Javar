package AggerigetionInInheritence;

public class Shoroom {
	String s_name;
	String s_addrese;
	int s_contectNo;
	Vehicle v;
	
	
	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public String getS_addrese() {
		return s_addrese;
	}


	public void setS_addrese(String s_addrese) {
		this.s_addrese = s_addrese;
	}


	public int getS_contectNo() {
		return s_contectNo;
	}


	public void setS_contectNo(int s_contectNo) {
		this.s_contectNo = s_contectNo;
	}


	public Vehicle getV() {
		return v;
	}


	public void setV(Vehicle e) {
		this.v = v;
	}


	@Override
	public String toString() {
		return  s_name + " " + s_addrese + " " + s_contectNo+v  ;
	}

}
