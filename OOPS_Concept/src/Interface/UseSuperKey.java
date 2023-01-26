package Interface;
interface first{
	default void firstX() {
		System.out.println("First interface");
	}
}
interface second{
	default void secondX() {
		System.out.println("Second interface");
	}
}
class Simple implements first,second{
	public void firstX() {
		first.super.firstX();
		second.super.secondX();
	}
	
}

public class UseSuperKey {

	public static void main(String[] args) {
		Simple s=new Simple();
		s.firstX();

	}

}
