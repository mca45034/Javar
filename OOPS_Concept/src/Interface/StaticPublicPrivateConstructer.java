package Interface;
interface Details{
	public static final String name="Rahul Kirar";
	default void defaultShow() {
		System.out.println("Showing default method");
	}
	void insert();
	static void staticShow() {
		System.out.println("Showing static method");
	}
	private void privateShow() {
		System.out.println(name);
	}
}
class ShowDetails implements Details{
	int id;
	String name;
	char grade;
	ShowDetails(int is,String name,char grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	@Override
	public void insert() {
		System.out.println(id+" "+name+" "+grade);
	}
	
}

public class StaticPublicPrivateConstructer {

	public static void main(String[] args) {
		Details d=new ShowDetails(1, "Rahul", 'A');
		d.insert();
		d.defaultShow();
		Details.staticShow();
	}

}
