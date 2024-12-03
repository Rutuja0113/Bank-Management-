package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi  implements Rbi { 
	
	
	Account a = new Account();
	Scanner sc = new Scanner(System.in);
	@Override
	public void createAccount() {
		
		System.out.println("Enter your name : ");
		a.setName(sc.next());
		
		System.out.println("Enter Account Number");
		a.setAccNo(sc.nextInt());
		
		System.out.println("Enter your AdharNo : ");
		a.setAdharNo(sc.next());
		
		System.out.println("Enter your MobileNo : ");
		a.setMobNo(sc.next());
		
		System.out.println("Enter your age: ");
		a.setAge(sc.nextInt());
		
		System.out.println("Enter Gender");
		a.setGender(sc.next());
		
		System.out.println("enter balance");
		a.setBalance(sc.nextDouble());
		
		
	
		
	}
	
	@Override
	public void displayAllDetails() {
		System.out.println("Name :"+ a.getName());
		System.out.println("Account No: "+a.getAccNo());
		System.out.println("Addhar No: "+ a.getAdharNo());
		System.out.println("Mobile No: "+ a.getMobNo());
		System.out.println("Gender :"+a.getGender());
		System.out.println("Age: "+ a.getAge());
		
	}

	
	
	@Override
	public void withdrawal() {
	 System.out.println("Enter amount for withdraw money");
	 double w = sc.nextDouble();
	 double p =  a.getBalance()-w;
	 a.setBalance(p);
	 System.out.println(w+"amount Successfully withdraw.....!!");
		
	}
	
	@Override
	public void depositeMoney() {
		
		 System.out.println("Enter amount for deposite money");
		 double x = sc.nextDouble();
		 double y =  a.getBalance()+x;
		 a.setBalance(y);
		 System.out.println(y+"Amount Deposited Successfully .....!!");
			
	
	}
	
	@Override
	public void balanceCheck() {
		System.out.println("your current Balance: "+a.getBalance());
	
	}

	

}
