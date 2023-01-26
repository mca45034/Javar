package Interface;
interface Demo{
	public static final int x=20;
	void Display();
}
class DemoChild implements Demo{
	int s;
	DemoChild(int s){
		this.s=s;
		System.out.println("I am constracture..."+s);
	}
	

	@Override
	public void Display() {
		System.out.println(x);
		
	}
	
}

public class Assigment_4 {

	public static void main(String[] args) {
		Demo d;
		d=new DemoChild(50);
         d.Display();
         
	}

}
