package dec_19th_assigment;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int pin = 9211;
		int balance=10000;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Username :");
	String username = sc.nextLine();
	System.out.println("Enter Your Pin :");
	int u_pin = sc.nextInt();
	System.out.println("-----WelCome To BOI-----");
	System.out.println("-----WelCome----"+username);
	int choice=0;
	if(pin==u_pin) {
		do {
			
	  System.out.println(" 1   Withdrow ");
	  System.out.println(" 2   Deposit ");
	  System.out.println(" 3   Cheak Belence ");
	  System.out.println(" 4   Exit ");
	  System.out.println(" Enter Your Choice ");
	  choice = sc.nextInt();
	  switch(choice) {
		  
	  case 1:
	  {
		  System.out.println(" Enter Your Amount To Withdrow ");
		  int withdrow = sc.nextInt();
		  if(withdrow>10000) 
		  {
			  System.out.println("InSufficent balence ");
		  }
		  else
			  balance = balance-withdrow;
		  System.out.println(" You Have Succesfully Withdrow Amount ");
			  System.out.println("Please Cheak Your Balence ");
			  break;
		  }
		  case 2:
		  {
			  System.out.println("Enter your Amount To Deosit  "); 
			  int dep=sc.nextInt();
			  balance=balance+dep;
			  System.out.println(" You Have Succesfully deposit amount ");
			  System.out.println(" Please Cheak your balance after deposit ");
			   break;
		  }
			  case 3: 
			    {
				  System.out.println("Bankbalance is ........... " +balance);
				  break;
		          }
			  case 4:{
				  System.exit(0);
			  }
	  }
	  }
	
	while(true);
	}
	else
		 System.out.println("-----SORRY WRONG PIN-----");
	}
	}


