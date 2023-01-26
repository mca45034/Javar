package AggerigetionInInheritence;

public class Vehicle {
	String v_name;
	String v_type;
	int v_model;
	int v_price;
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_type() {
		return v_type;
	}
	public void setV_type(String v_type) {
		this.v_type = v_type;
	}
	public int getV_model() {
		return v_model;
	}
	public void setV_model(int v_model) {
		this.v_model = v_model;
	}
	public int getV_price() {
		return v_price;
	}
	public void setV_price(int v_price) {
		this.v_price = v_price;
	}
	@Override
	public String toString() {
		return  v_name + " " + v_type + " " + v_model + " " + v_price;
	}
	

}
