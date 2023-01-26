package Using_StaticKeyword;

public class bike {
	private static String b_name="----PULSER----";
	int b_engin_cc;
	String b_breake;
	String b_engin_number;
	String b_number;
	char wing;
	static String rating;
	{
		rating="Five_*";
	}
	private static String b_Ai="full AI besed technology";
	public bike(int b_engin_cc,String b_breake,String b_engin_number,String b_number) {
		 this.b_engin_cc=b_engin_cc;
		 this.b_breake=b_breake;
		 this.b_engin_number=b_engin_number;
		 this.b_number=b_number;
	}
	void display() {
		System.out.println("Bike Rating are...."+rating);
		System.out.println("Bike engin cc is.."+b_engin_cc);
		System.out.println("Bike breake  is.."+b_breake);
		System.out.println("Bike engin number is.."+b_engin_number);
		System.out.println("Bike number is.."+b_number);
		 bikemailadge();
	}
	static void bikemailadge() {
		System.out.println("It Is Very Good Mailedgeble Bikes");
		non_static();
	}
	static void non_static() {
		System.out.println("I Am Non_Static");
	}
	
	public static void main(String[] args) {
		System.out.println(b_name);
		System.out.println(b_Ai);
		rating();
		System.out.println("---------------------------------------------------");
		bike b=new bike(125, "Disk-Break", "ANS22004NM", "MP-09,3129");
		b.display();
		System.out.println("----------------------------------------------------");
		bike b1=new bike(125, "Simple-Break", "BCG533544NM", "UP-45,5029");
		b1.display();
		System.out.println("----------------------------------------------------");
		rating="four-*";
		bike b2=new bike(125, "double-Disk-Break", "MNS22994NM", "TM-08,1169");
		b2.display();
		System.out.println("-----------------------------------------------------");
		bike b3=new bike(125, "Oil-Break", "TYS22004DFM", "RJ-15,3459");
		b3.display();
		System.out.println("-----------------------------------------------------");
		

	}
	private static void rating() {
		// TODO Auto-generated method stub
		
	}
}
