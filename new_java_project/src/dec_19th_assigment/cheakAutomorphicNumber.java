package dec_19th_assigment;

public class cheakAutomorphicNumber {

	public static void main(String[] args) {
		int  num =25,count=0;
		int squre=num*num;
		int temp=num;
		while(temp>0) {
		 int rem=num%10;
		 count++;
		 temp=temp/10;
		}
		int power=2;
		int result=1;
		while(power>0) {
			result=result*num;
			power--;
		
		if(num==result) {
			System.out.println("Yes Automorphic Number");
		}
		else
			System.out.println("Not Automorphic Number");
		}

	}

}
