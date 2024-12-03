package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.serviceImpl.*;

import java.util.Scanner;

import com.braindata.bankmanagement.service.*;



public class Test {

	public static void main(String[] args) {
		
		Rbi r = new Sbi();
		r.createAccount();
		r.displayAllDetails();
		r.depositeMoney();
		r.withdrawal();
		r.balanceCheck();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("-------------Bank Management System---------------------");
		
		System.out.println("1. Create Account");
        System.out.println("2. Display Account Details");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Balance Check");
        System.out.println("6. Exit");
        System.out.println("----------------------------------");
        System.out.print("Enter your choice: ");
         
        int choice = sc.nextInt();
        
        switch(choice)
        {
        
        	case 1 : 
        		r.createAccount();
        	break;
        
        
            
        	case 2 : 
        		r.displayAllDetails();
        	break;
        
        
            
        	case 3 : 
        	r.depositeMoney();
        	
        	break;
        
        
            
        	case 4 : 
        		r.withdrawal();
        	
        	break;
        	

        	case 5 : 
        	r.depositeMoney();
        	
        	break;
        	
        	default:
        		System.out.println("Invalid Input../n please enter valid input");
        		
        
        }


		
	
		 
		 

	}

}
}

	
