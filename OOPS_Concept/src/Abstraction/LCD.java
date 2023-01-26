package Abstraction;

 abstract public class LCD {
	static String name="---LCD-----";
	public void Display() {
		System.out.println("All Featur Avaleble....");
	}
	abstract void Processer();
	abstract void TuachSreen();
	abstract void multiLed();
}
 class LCD1 extends LCD{
	 String name;
	 int price;
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setPrice(int price) {
		 this.price=price;
	 }
	 public int getPrice() {
		 return price;
	 }
	 

	@Override
	void Processer() {
		System.out.println("High Tuach Processer....");
		
	}

	@Override
	void TuachSreen() {
		System.out.println("Very Smooth Tuach Screen.....");
		
	}

	@Override
	void multiLed() {
		System.out.println("100 Plusn led ....");
		
	}
	 
 }
