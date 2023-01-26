package Arrays_type_2;

import java.util.Scanner;

public class AllPairsWithSum {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size");
   int size=sc.nextInt();
   System.out.println("Enter the element");
   int num[]=new int[size];
   for(int i=0;i<size;i++) {
	   num[i]=sc.nextInt();
   }
   System.out.println("Enter the size");
   int size1=sc.nextInt();
   System.out.println("Enter the element");
   int num1[]=new int[size];
   for(int i=0;i<size1;i++) {
	   num1[i]=sc.nextInt();
   }
   System.out.println("Enter the pair of sum number : ");
   int x=sc.nextInt();
//		int a[]= {1, 2, 4, 5, 7};
//		int b[] = {5, 6, 3, 4, 8} ;
//		int x = 9;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size1;j++) {
				if(num[i]+num1[j]==x) {
					System.out.print("("+num[i]+" "+num1[j]+")");
				}
			}
		}
		

	}

}
