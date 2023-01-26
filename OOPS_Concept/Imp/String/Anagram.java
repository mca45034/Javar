package String;

public class Anagram {

	public static void main(String[] args) {
		String s="silent";
		String s1="listen";
		int count=0,flage=0;
		String str1=s.toUpperCase();
		String str2=s1.toUpperCase();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			for(int j=i+1;j<ch1.length;j++) {
				if(ch1[i]>ch1[j]) {
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
		}
		for(int i=0;i<ch1.length;i++)
		 {
			System.out.print(ch1[i]);
		}
		System.out.println("");
		for(int i=0;i<ch2.length;i++) {
			for(int j=i+1;j<ch2.length;j++) {
				if(ch2[i]>ch2[j]) {
					char temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				}
			}
		}
		for(int i=0;i<ch2.length;i++)
		 {
			System.out.print(ch2[i]);
		}
		System.out.println("");
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				count++;
				flage=1;
			}
		}
		if(flage==1 && count==ch1.length) {
			System.out.println("Angram");
		}
		else {
			System.out.println("Not Anagram");
		}
		

		}

}
