package String;

import java.util.Arrays;

public class ReversString {

	public static void main(String[] args) {
		String s="Rahul kirar";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(" "+ch[i]);
		}
		System.out.println(s);
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
			
		}
		s=Arrays.toString(ch);
		System.out.println(s);
       
	}

}
