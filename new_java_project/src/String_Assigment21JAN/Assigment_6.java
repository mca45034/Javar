package String_Assigment21JAN;

public class Assigment_6 {

	public static void main(String[] args) {
		String s="rahul";
		
		String s1="KIRAR";
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			ch[i]=(char) (ch[i]-32);
		}
		System.out.println("original String : "+s);
		System.out.println(ch);
		for(int j=0;j<ch1.length;j++) {
			ch1[j]=(char) (ch[j]+32);
		}
		System.out.println("original String : "+s1);
		System.out.println(ch1);

	}

}
