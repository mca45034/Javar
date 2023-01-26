package Assigment_29DEC_StaticKeyword;

public class CarCreation {
	static String c_name="----WELCOME CAR SOLD----";
	static String i_name="===InttotalCarSold===";
     String c_fecher;
     String c_fesilitiy;
     int c_model;
   String c_enginNo;
   static int b=90;
     int a;
   
   CarCreation(){
	  b++; 
   }
   
   public void showdata() {
	   System.out.println("value is="+a);
	   System.out.println("value is="+b);
   }
//   public static void increment() {
//		  a++;
//	   }
   
   
     
     public CarCreation(String c_fecher, String c_fesilitiy, int c_model, String c_enginNo) {
		super();
		this.c_fecher = c_fecher;
		this.c_fesilitiy = c_fesilitiy;
		this.c_model = c_model;
		this.c_enginNo = c_enginNo;
	}
	void display() {
    	 System.out.println("Car fecher is="+c_fecher);
    	 System.out.println("Car fesilitiy is="+c_fesilitiy);
    	 System.out.println("Car model is="+c_model);
    	 System.out.println("Car engine number="+c_enginNo);
     }
	static void car() {
		System.out.println("There are static variable");
		//System.out.println(c_name);
		no_static();
	}
 static void no_static() {
	 System.out.println("Non static variable");
 }
	public static void main(String[] args) {
		System.out.println(c_name);
		System.out.println(i_name);
		System.out.println("this is static variable.."+b);
		CarCreation cc=new CarCreation("All fecher available", "machenical", 2022, "SND2211033A");
		System.out.println("---------------------------------------");
		cc.display();
		cc.showdata();
		System.out.println("----------------------");
		CarCreation cc1=new CarCreation();
		cc1.c_fecher=cc.c_fecher;
		cc1.c_fesilitiy=cc.c_fesilitiy;
		cc1.c_model=cc.c_model;
		cc1.c_enginNo=cc.c_enginNo;
		cc1.display();
		cc.car();
		no_static();
				
		
	}

}
