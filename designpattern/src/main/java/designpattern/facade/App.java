package designpattern.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	private static int choice;
	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.println("Welcome to Franchise Service Registration.... !\n");
			System.out.println("1. KFC \n");
			System.out.println("2. McDonalds \n");
			System.out.println("3. Dominos \n");
			System.out.println("4. Exit \n");
			System.out.println("Please enter your Franchise Option Number: ");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice= Integer.parseInt(br.readLine());
			FranchiseServiceReg sp = new FranchiseServiceReg();
			switch(choice) {
				case 1: {
					sp.BuyKFCFranchise();
					break;
				}
				case 2: {
					sp.BuyMcDonaldsFranchise();
					break;
				}
				case 3: {
					sp.BuyDominosFranchise();
					break;
				}
				case 4:
					 break;
				default: {
					System.out.println("Please check the input and try again");
				}
			}
			
		}while(choice !=4);
	}

}