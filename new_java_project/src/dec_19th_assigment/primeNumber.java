package dec_19th_assigment;

public class primeNumber {
	public static void main(String[] args) {
		
	
	for(int i=300;i<400;i++) {
		int flage=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flage=1;
			}
		}
		if (flage==0) {
			System.out.println("Prime Number : "+i);
	}
}

}
}
