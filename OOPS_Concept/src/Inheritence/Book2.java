package Inheritence;

public class Book2 {

	String name="Mr Rahul Kirar";
	
	void calculate(int quantity)
	{
		
		Book b1=BookMain.Details();
		int total=quantity*b1.getPrice();
		System.out.println("Book name is...."+b1.getB_name());
		System.out.println("Authore name is..."+b1.author_name);
        System.out.println("youre total bill..."+total);
        System.out.println(name);

	}
	public static void main(String[] args) {
		Book2 b=new Book2();
		b.calculate(20);
	}

}
