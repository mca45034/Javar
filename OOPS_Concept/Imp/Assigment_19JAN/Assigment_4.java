package Assigment_19JAN;

public class Assigment_4 {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String s="Java Program to count the total number of vowels and consonants in a string";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vCount++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("Number of vowels : "+vCount);
		System.out.println("Number of consonant : "+cCount);

	}

}
