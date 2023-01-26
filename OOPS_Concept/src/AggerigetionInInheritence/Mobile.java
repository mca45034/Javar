package AggerigetionInInheritence;

public class Mobile {
	String m_name;
	int m_ram;
	int m_rom;
	int m_price;
	public void setM_name(String m_name) {
		this.m_name=m_name;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_ram(int m_ram) {
		this.m_ram=m_ram;
	}
	public int getM_ram() {
		return m_ram;
	}
	public void setM_rom(int m_rom) {
		this.m_rom=m_rom;
	}
	public int getM_rom() {
		return m_rom;
	}
	public void setM_price(int m_price) {
		this.m_price=m_price;
	}
	public int getM_price() {
		return m_price;
	}
	public String toString() {
		return m_name+" "+m_name+" "+m_ram+" "+m_rom+" "+m_price;
	}

}
