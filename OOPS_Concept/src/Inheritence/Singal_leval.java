package Inheritence;
class Mobile{
	String s="welcome to mobile zone";
	String s1="priveding processor";
	Mobile() {
		System.out.println("default constracter ");
	}
	void display() {
		System.out.println(s);
	}
}
class Samsung extends Mobile
{
	String b_name="samsung";
	String s="20 gb Ram";
	int price = 20000;
	Samsung(){
		System.out.println("samsung is difalt constracter");
	}
	void display() {
		super.display();
		System.out.println("Brand name..."+b_name);
		System.out.println("features is.."+s);
		System.out.println("price is..."+s);
		System.out.println(super.s1);
		System.out.println(s);
	}
}

public class Singal_leval {
	
	public static void main(String[] args) {
	Samsung s=new Samsung();	
     s.display();
	}

}
