package String;

public class ReplecMethod {

	public static void main(String[] args) {
		String s="r a h u l";
		String t=s.replace(' ','\0');
		String s1="i love india";
		char ch[]=t.toCharArray();
		
		char[] ch1=s1.toCharArray();
		String t1=s1.replace("india", "indore");
		System.out.println(ch1);
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='\0') {
				System.out.print(ch[i]);
			}
			
		}
		System.out.println(" ");
		boolean a=s1.contains("k");
		if(a==true) {
			System.out.println("String is present");
		}
		else {
			System.out.println("Not present");
		}

	}

}
