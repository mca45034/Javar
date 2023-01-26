package Abstraction;
abstract class Car{
	String name="-----Shri-----";
	Car(String color){
		System.out.println("Wel come to Car shoroom");
	}
	public void Engine() {
		System.out.println("Engin power is very high");
	}
	public void Facilitiy() {
		System.out.println("All fecility is avaleble");
	}
	abstract public void Ai();
}
class AudiCar extends Car {
	AudiCar(String color){
		super(color);
	}

	@Override
	public void Ai() {
		System.out.println(name);
		System.out.println("Audi is Ai fecility");
		System.out.println("Engin is 500cc ");
		
	}
}

public class ShoroomDetails {

	public static void main(String[] args) {
	Car s=new AudiCar("Blue");
		s.Engine();
		s.Facilitiy();
		s.Ai();
		
	}

}
