package WrittenAssigment_31DEC;

public class Assigment_3_Cycle {
	int accountNo;
	int noOfWheels;
	 Assigment_3_Cycle(){
		System.out.println( "I am default constructor");
	}
	
	
	public Assigment_3_Cycle(int noOfWheels) {
	    System.out.println("I am another constructor");
		this.noOfWheels = noOfWheels;
	}
	void display() {
		System.out.println("Cycle number of wheels is : "+noOfWheels);
	}

	public static void main(String[] args) {
		Assigment_3_Cycle cy=new Assigment_3_Cycle();
		Assigment_3_Cycle c=new Assigment_3_Cycle(4);
		c.display();
		Member m=new Member("Ram",8120217);
		m.display();

	}

}
