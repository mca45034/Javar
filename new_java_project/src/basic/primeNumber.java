package basic;

public class primeNumber {

	public static void main(String[] args) {
		int num=7,i;
		int flage=0;
		int count=0;
		for( i=2;i<num;i++) {
			if(num%i==0) {
				 flage=1;
				 //count++;
			}
		}
		
		if(flage==0) {
			System.out.println(" prime"+i);
		}
		else
		
			System.out.println("Not prime");
		

	}

}
