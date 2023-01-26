package String;

public class MethodInString {
	static void finlen(char ch[]) {
		int count=0;
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String s="Rahul";
		char ch[]=s.toCharArray();
		finlen(ch);

	}

}
