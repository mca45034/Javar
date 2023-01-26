package Inheritence;
class Company {
	String c_name;
	int c_contect;
	String hr_name;
	Company(String c_name,int c_contect,String hr_name){
		this.c_name=c_name;
		this.c_contect=c_contect;
		this.hr_name=hr_name;
	}
	public String toString() {
		return "Company name :"+c_name+"\n"+"Company contect number :"+c_contect+"\n"+"Company HR name :"+hr_name;
	}
	
}
class Employ extends Company{
	Employ()
		{
			super("MICROSOFT",812021,"Sham");
		}
	public String toString() {
		System.out.println(super.toString());
		return null;
		
	}
}

public class singalCompany {

	public static void main(String[] args) {
		Employ e=new Employ();
		System.out.println(e);
		

	}

}
