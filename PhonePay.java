package com.xworkz.method;

public class PhonePay {

	public static void transferMoney() {
		System.out.println(" Transaction successfully");
	}

	public static void rechargeMobile() {
		System.out.println(" Recharge  successfull");
	}

	public static void electricityBill() {
		System.out.println(" Electricity bill paid successfull");
	}

	public static void rechargeDTH() {
		System.out.println(" DTH recharge successfull ");
	}

	public static void main(String[] args) {

		System.out.println(" Login to Phonepe");
		PhonePay.rechargeDTH();
		PhonePay.electricityBill();
		PhonePay.rechargeMobile();
		PhonePay.transferMoney();
		System.out.println(" Logout ");
	}
}
