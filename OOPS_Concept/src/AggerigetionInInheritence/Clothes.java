package AggerigetionInInheritence;

public class Clothes {
	String c_brand;
	String c_manufacture;
	public void setC_brand(String c_brand) {
		this.c_brand=c_brand;
	}
	public String getC_brand() {
		return c_brand;
	}
	public void setC_manufature(String c_manufacture) {
		this.c_manufacture=c_manufacture;
	}
	public String getC_manufacture() {
		return c_manufacture;
	}
	@Override
	public String toString() {
		return "Clothes [c_brand=" + c_brand + ", c_manufacture=" + c_manufacture + "]";
	}
	

}
