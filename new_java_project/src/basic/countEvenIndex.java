package basic;

public class countEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int count=0,sum=0;
		while(num>0) {
			int rem=num%10;
			for(int i=1;i<=rem;i=i+2) {
			count++;
			sum=sum+rem;
			num=num/10;
			}
			System.out.println("index: "+count);
		}
		System.out.println("index: "+count);
		//System.out.println("total sum: "+sum);

	}

}
