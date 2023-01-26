package String;

import java.util.StringJoiner;

public class Methos1 {

	public static void main(String[] args) {
		String s="rahul";
		String s1="kirar";
		int sum=0;
		StringJoiner sj=new StringJoiner(" ");
		sj.add(s);
		sj.add(s1);
		String s2=sj.toString();
		char ch[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='r' ||ch[i]=='a' || ch[i]=='i')
			{
				int x=ch[i];
				sum=sum+x;
				System.out.println(ch[i]+"------"+x);
				System.out.println(sum);
			}
		}
		

	}

}
