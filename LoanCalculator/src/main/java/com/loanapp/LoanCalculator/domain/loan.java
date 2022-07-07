package com.loanapp.LoanCalculator.domain;

public class loan {

	private int loanAmount = 1000;
	private int anualInterestProcent = (5/100);
	private int numberOfMonths = 10;
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getAnualInterestProcent() {
		return anualInterestProcent;
	}
	public void setAnualInterestProcent(int anualInterestProcent) {
		this.anualInterestProcent = anualInterestProcent;
	}
	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	
}
