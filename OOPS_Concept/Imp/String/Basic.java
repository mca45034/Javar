package String;

public class Basic {

	public static void main(String[] args) {
		String s="HELLO";
		String r="RAHUL";
		String k="kirar";
		System.out.println(r.toLowerCase());
		System.out.println(k.toUpperCase());
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			ch[i]=(char) (ch[i]+32);
		}
		System.out.println(ch);
		String s1="hello";
		char ch1[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			ch1[i]=(char) (ch1[i]-32);
		}
		System.out.println(ch1);
	}

}
