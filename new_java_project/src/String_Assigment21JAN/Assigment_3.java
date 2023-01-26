package String_Assigment21JAN;

public class Assigment_3 {
	public static void main(String[] args) {
	String s="by the end century the revolution took pleace this time in hence france";
	String str=s.toLowerCase();
	char ch[]=str.toCharArray();
	int Vcount=0;
	int Ccount=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
			Vcount++;
		}
		else if(ch[i]>='a' && ch[i]<='z') {
			Ccount++;
		}
	}
	System.out.println("vowel count :"+Vcount);
	System.out.println("consonants"+Ccount);
	System.out.println("total number of count :"+ch.length); 
	 
	
	}
}
