package patter_All;

public class pettern11 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 ||i==5 || j==i||j==2*i-1) {
				System.out.print("*");
				}
				else
		System.out.print(" ");
		}
			System.out.println("");
		}
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				//System.out.print(" ");
				if(j==1 || j==9 || i==9) {
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
