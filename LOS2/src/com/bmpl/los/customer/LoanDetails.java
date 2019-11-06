package com.bmpl.los.customer;

public class LoanDetails {
	
	private String type;
	private double amount;
	private double roi;
	private double loanPercentage;
	private int duration;
	private int score;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public double getLoanPercentage() {
		return loanPercentage;
	}
	public void setLoanPercentage(double loanPercentage) {
		this.loanPercentage = loanPercentage;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
