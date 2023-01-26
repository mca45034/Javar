package Assigment_7Jun;

interface Cake{
	public static final String name="-----WEL COME Bakery-----";
	 default void Show () {
		System.out.println(name);
	}
	void CakeFlavors ();
}
class Strawberry implements Cake{

	@Override
	public void CakeFlavors() {
		System.out.println("Cake Flavors is Strawberry..");
		
	}
	
}
class BlackForest implements Cake{

	@Override
	public void CakeFlavors() {
		System.out.println("Cake Flavors is BlackForest..");
		
	}
	
}

public class Assigment_3 {
	public static void main(String[] args) {
		Cake c;
		
		c=new Strawberry();
		c.Show();
		c.CakeFlavors();
		c=new BlackForest();
		System.out.println("--------------------------");
		c.Show();
		c.CakeFlavors();

}
}
