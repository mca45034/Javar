package HomeWork_programs;

public class happyNumber {
	public static void main(String[] args) {
		int num=5,sum=0;
		while(num>0) {
			int rem=num%10;
			for(int i=1;i<num;i++) {
			sum=sum+(rem*rem);
			}
			num=num/10;	
		}
		System.out.println(sum);
	}

}
