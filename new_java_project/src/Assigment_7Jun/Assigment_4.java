package Assigment_7Jun;
interface  IceCream{
	public default  void IceCream1() {
		System.out.println("Seve to Soft Drink");
	}
	abstract void Eat();
	abstract void Juice();
}
class Mastani implements IceCream{
	String e_name="Chhole";
	int e_price=50;
	String j_name="mengo-juice";
	int j_price=30;

	@Override
	public void Eat() {
	System.out.println("Food price..."+e_price);
	System.out.println("Eating Food..."+e_name);	
		
	}

	@Override
	public void Juice() {
		
		System.out.println("juice price..."+j_price);
		System.out.println("Mengo juice..."+j_name);	
	}
	
}
 

public class Assigment_4 {

	public static void main(String[] args) {
		IceCream i;
		i=new Mastani();
		i.Eat();
		i.Juice();

	}

}
