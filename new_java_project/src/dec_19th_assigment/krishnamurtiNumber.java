package dec_19th_assigment;

import java.util.Scanner;

public class krishnamurtiNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num=sc.nextInt();
	int sum=0;
	int temp=num;
	
	while(num>0)
	{
		int rem=num%10;
		int fact=1;
		
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	
	if(temp==sum)
	{
		System.out.println("krishnamurthy or strong number");
	}
	else
		System.out.println("not krishnamurthy number");

}

}
