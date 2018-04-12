package com.assignment_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account_Runner 
{
	long[] accNum = new long[2];
	double balance;
	//String accHolder;
	
	static Account_Runner ar = new Account_Runner();
	
	void acc_num_gen(int accNum)
	{
		for(int i = 0; i < ar.accNum.length; i++) 
		{
		      ar.accNum[i] = (int)(Math.random()*20 + 1);
		}
	}
	
	void deposit(double deposit_amt)
	{		
		double amt_to_user = ar.balance + deposit_amt;
		System.out.println("Transaction Successful. New Account Balance is:");
		System.out.println(amt_to_user);
	}
	
	void withdraw(double withdraw_amt)
	{
		if(ar.balance<=500)
		{
			System.out.println("Transaction Denied - Account Balance is INR 500 or less.\n");
			System.out.println("Account Balance is:");
			System.out.println(ar.balance);
		}
		else
		{
			double amt_to_user = ar.balance - withdraw_amt;
			System.out.println("Transaction successful. Account balance remaining:");
			System.out.println(amt_to_user);
		}
	}
	
	void getBalance(double balanceAmt)
	{
		ar.balance = balanceAmt;
		System.out.println("Account Balance is:");
		System.out.println(balanceAmt);
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	class Person
	{
		String[] name = new String[2];
		float[] age = new float[] {32.0f,26.0f};
		
		void acc_assoc()
		{
			name[0] = "Smith";
			name[1] = "Katherine";
		
			Account_Runner ar1 = new Account_Runner();
			
			Map<long[],String> keyval = new HashMap<long[],String>();

	        for(int  i = 0 ; i < name.length ; i++ )
	        {
	            keyval.put(ar1.accNum[i], name[i]);
	        }
		}
	}
	
	public static void main(String args[])
	{
		Scanner insert = new Scanner(System.in);
		int choice;
		
		System.out.println("Banking Interface 1.0");
		System.out.println("Make a selection.");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Deposit Amount");
		System.out.println("4. Exit");
		System.out.println("Enter Selection:");
		
		choice = insert.nextInt();
		
		if(choice==1)
		{
			ar.getBalance();
		}
		else if(choice==2)
		{
			double with_amt;
			System.out.println("Enter amount to Withdraw:");
			with_amt = insert.nextInt();
			ar.withdraw(with_amt);
		}
		else if(choice==3)
		{
			double dep_amt;
			System.out.println("Enter amount to Deposit:");
			dep_amt = insert.nextInt();
			ar.deposit(dep_amt);
		}
		else if(choice==4)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid selection. Please try again.");
			System.exit(0);
		}
	}
}
