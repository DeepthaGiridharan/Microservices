package com.cognizant.account.model;

public class Account {
private String number;
private String acctype;
private double balance;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public Account(String number, String acctype, double balance) {
	super();
	this.number = number;
	this.acctype = acctype;
	this.balance = balance;
}
}
