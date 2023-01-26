package dec_19th_assigment;

import java.util.Scanner;

public class polindramNumber {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number=");
     int n = sc.nextInt();
     sc.close();
     int sum=0,temp;
     temp=n;
     while(n>0)
     {
        int rem = n%10;
         sum=(sum*10)+rem;
         n=n/10;
     }
    if(temp==sum)
   {
         System.out.println("This value are Palindrome");
     }
     else{
         System.out.println("not Palindrome");
     }
 }
}