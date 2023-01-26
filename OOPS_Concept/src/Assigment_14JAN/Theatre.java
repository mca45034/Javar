package Assigment_14JAN;

public class Theatre {
	int Theatreid;
	String Theatrename;
	String location;
	Movie m;
	public Theatre(int theatreid, String theatrename, String location, Movie m) {
		super();
		this.Theatreid = theatreid;
		this.Theatrename = theatrename;
		this.location = location;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
				+ m + "]";
	}	

}
