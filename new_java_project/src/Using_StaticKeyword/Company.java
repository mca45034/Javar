package Using_StaticKeyword;

public class Company {
	static String c_name="----Cisco Company----";
	int e_id;
    String e_department;
    int e_age;
    static char  star;{
    	star='A';
    }
   public  Company(int e_id,String e_department,int e_age) {
	   this.e_id=e_id;
	   this.e_department=e_department;
	   this.e_age=e_age;
	   
   }
   void display() {
	   System.out.println("Employee wing is..."+star);
	   System.out.println("Employee id is="+e_id);
	   System.out.println("Employee department is="+e_department);
	   System.out.println("Employee age is="+e_age);
	  
   }
   static void display1() {
	   System.out.println("-----WEL COME TO CISCO-----");
   }
	public static void main(String[] args) {
		System.out.println(c_name);
		Company.display1();
		Company c=new Company(101,"HR",30 );
		c.display();
		System.out.println("-------------------");
		Company c1=new Company(201,"IT",35 );
		c1.display();
		star='B';
		System.out.println("-------------------");
		Company c2=new Company(301,"CA",40 );
		c2.display();
		System.out.println("--------------------");
		Company c3=new Company(302,"Commonication",38 );
		c3.display();
		
		

	}

}
