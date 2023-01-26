package Interface;

public interface Phone {
	public static final String name="---WEL COME TO PHONE---";
	default void Show() {
		System.out.println(name);
	}
	void Foldeble();
	void Facelock();
	void TuachScreen();
}
class SmartPhone implements Phone{
	String p_name;
	int p_price;
	public void setP_name(String p_name) {
		this.p_name=p_name;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_price(int p_price) {
		this.p_price=p_price;
	}
	public int getP_price() {
		return p_price;
	}
	

	@Override
	public String toString() {
		return "SmartPhone [p_name=" + p_name + ", p_price=" + p_price + "]";
	}
	@Override
	public void Foldeble() {
		System.out.println("There are Foldeble SmartPhone");
		
	}

	@Override
	public void Facelock() {
		System.out.println("There are Facelock SmartPhone");
		
	}

	@Override
	public void TuachScreen() {
		System.out.println("There are TuachScreen SmartPhone");
		
	}
	
}
