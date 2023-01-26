package Interface;
interface Printeble{
	void print();
}
interface Showbal{
	void print();
}
class Print1 implements Printeble,Showbal{

	@Override
	public void print() {
		System.out.println("Similar print ");
		
	}
	
}
public class SimilarInterfaceMethod {

	public static void main(String[] args) {
		Showbal s=new Print1();
		s.print();
		Printeble p=new Print1();
		p.print();
		

	}

}
