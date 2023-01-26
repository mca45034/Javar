package Assigment_19JAN;

public class Assigment_3 {

	public static void main(String[] args) {
		String s="hElLo rAhUl";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char) (ch[i]+32);
				System.out.print(ch[i]);
			}
			else if(ch[i]>=97 && ch[i]<=120) {
				ch[i]=(char) (ch[i]-32);
				System.out.print(ch[i]);
			}
			else if(ch[i]==' ') {
				System.out.print(" ");
			}
		}

	}

}
