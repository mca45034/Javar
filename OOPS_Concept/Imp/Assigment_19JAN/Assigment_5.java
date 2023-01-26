package Assigment_19JAN;

public class Assigment_5 {

	public static void main(String[] args) {
		String s="Rahul Kirar";
		String reverdstr="";
		for(int i=s.length()-1;i>=0;i--) {
			reverdstr=reverdstr + s.charAt(i);
		}
		System.out.println("Orignal String : "+s);
		System.out.println("Revers String : "+reverdstr);

	}

}
