package String_Assigment21JAN;

public class Assigment_8 {

	public static void main(String[] args) {
		String s="rahul kumar kirar";
		String[] sh=s.split("\\s");
		//System.out.println(sh);
		String f=sh[0];
		String l=sh[2];
		for(int i=0;i<sh.length;i++) {
			l=sh[sh.length-2];	
		}
		System.out.println(l);

	}

}
