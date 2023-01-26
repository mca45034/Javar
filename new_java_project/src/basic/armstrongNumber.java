package basic;

public class armstrongNumber {
	public static void main(String[] args) {	
	int num=153;
	int sum=0;
	int temp=0;
	temp=num;
	while(temp>0) {
		int rem=num%10;
	   sum=sum+(rem*rem*rem);
	   temp--;
	   
	num=num/10;
	}
	if(sum==num) {
		System.out.println(" is an Armstrong number:" +sum);
	}
	else
		System.out.println( " is not Armstrong number:"+sum);
	}
	
}
