package org.bank;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("Deposit:\t10%");
	}
	
	public static void main(String[] args) {
		
		AxisBank interestRates = new AxisBank();
		
		interestRates.saving();
		interestRates.fixed();
		
		interestRates.deposit();
	}
}
