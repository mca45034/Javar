package incapsulation;

public class ThisConstructor {
	String name;
	int m_no;
	
	ThisConstructor(String name, int m_no){
		this.name=name;
		this.m_no=m_no;
	}
	void display() {
		System.out.println("Department naem is.:"+name);
		System.out.println("DEpartment Id is.:"+m_no);
	}
          
	public static void main(String[] args) {
		ThisConstructor d=new ThisConstructor("IT",81202135);
		d.display();
		ThisConstructor d1=new ThisConstructor("HR",93014667);
		d1.display();

	}

}
