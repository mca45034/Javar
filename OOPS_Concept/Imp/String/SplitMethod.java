package String;

public class SplitMethod {

	public static void main(String[] args) {
		String s="i love my india";
		String a[]=s.split("\\s");
		int count=a.length;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(count);

	}

}
