package Abstraction;
 abstract class Laptop {
	static {
		 String name="----Providing Leptop Information------";
		 System.out.println(name);
	}
	static void anme(String name) {
		System.out.println("Laptop Breand is .."+name);
	}
	 Laptop(String color)
	{
		System.out.println("Constractur colling");
	}
	public void Procceser() 
	{
		System.out.println("there are will be 3.55mmm Prosesser ");
	}
	public void Ssd() {
		System.out.println("512 Gb SSD ");
	}
	public void Ram() {
		System.out.println("8 Gb RAM");
	}
	public void Graphics(){
		System.out.println("2.02 is Graphic Card");
	}
	abstract public void GraphicsCard();
}
  
 class Dell extends Laptop{
	 int g=5;
	  Dell(String color) {
		super(color);
		
	}
	@Override
	public void GraphicsCard() {
		System.out.println("Dell is providing Graphic Card in large scale ");
		System.out.println("Dell Graphic card...."+g);
	}
 }
 

public class LaptopMain {
	public static void main(String[] args) {
		
		Laptop.anme("Dell");
		Laptop l=new Dell("Black");
		l.Procceser();
		l.Ssd();
		l.Ram();
		System.out.println("--------------");
		l.Graphics();
		l.GraphicsCard();
	}
	
	

}
