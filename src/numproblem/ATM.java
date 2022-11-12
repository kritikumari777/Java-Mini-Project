package numproblem;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long baleance =10000, withdrow, deposit;
        
		while(true){
			System.out.println("Automated teller Machine");
			System.out.println("choose 1 for withdrow");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for check baleance");
			System.out.println("choose 4 for exit");
			System.out.println("chosse 5 for more option:");
			
			int a = sc.nextInt(); // option
		
			switch(a) {
			case 1:
				System.out.println("Enter the amount to withdrow");
				long amountwd = sc.nextLong();
				if(baleance>amountwd) {
					baleance = baleance-amountwd;
					System.out.println("Please collect your money");
				}
				else {
					System.out.println("Insufficint Baleance");

				}
				break;
			case 2:
				System.out.println("Enter the amount to deposit");
				long amountd = sc.nextLong();
				baleance=baleance+amountd;
				System.out.println("amount added succesfull");
				break;
				
			case 3:
				System.out.println("Baleance"+baleance);
				break;
				
			case 4:
				System.exit(0);
			}
			System.out.println("-----------------------------------");
			}
		}
	}

