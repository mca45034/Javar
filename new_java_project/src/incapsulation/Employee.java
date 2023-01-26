package incapsulation;

public class Employee {
	 public String e_name="Rahul Kirar";
	protected String mob_num="8120213549";
	String email_id="rahulkirar101214@gmail.com";
	private String verification_code="9211";
	public Employee() {
		
	}
	public Employee(String n,String m,String em,String ve) {
		e_name=n;
		mob_num=m;
		email_id=em;
		verification_code=ve;
	}

	public static void main(String[] args) {
		Employee e= new Employee();
		System.out.println( e.verification_code);
		System.out.println(e.email_id);
		System.out.println(e.mob_num);
		System.out.println(e.e_name);

	}

}
