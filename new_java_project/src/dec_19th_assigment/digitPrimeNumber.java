package dec_19th_assigment;

public class digitPrimeNumber {
	public static void main(String[] args) {
		int num=34652;
		int rem=0;
		while(num>0) {
			rem=num%10;
			 int flage=0;
			for(int i=2;i<rem;i++) {
				if(rem%i==0) {
				 flage=1;
				}
			}
			num=num/10;
			if(flage==0) {
				System.out.println(rem);
		}
		
		}
	}

}
