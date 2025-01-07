package designpattern.chainofresp;

import java.util.Scanner;

public class ATMDispenseChain {
	private DispenseChain c1;
	
	public ATMDispenseChain() {
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while(true) {
			int amount =0;
			System.out.println("Enter amount to dispense");
			Scanner ip = new Scanner(System.in);
			amount = ip.nextInt();
			if(amount %10 !=0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			
			//process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}
}
