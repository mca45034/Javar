package patter_All;

public class pettern5 {
	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(" ");
			if(j==1 || i==1 || j==5 || i==5) {
			System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
		
	}

}
