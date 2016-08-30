package com.ssa.tiy.junitlesson;

public class Account {
	
	private int id;
	private String description;
	private double balance;
	
	
	//constructor
		public Account(int id, String description){
			this.id = id;
			this.description = description;
			this.balance = 0;
		}
		//constructor for description
		public Account(String description){
			this.description = description;
			this.balance = 0;
		}
		Account() {
			this.description = "default account description";
			this.balance = 0;
				
		}
		
	public double deposit(double aDeposit){
		balance = balance + aDeposit;
		return balance;
	}
	
		public double withdraw(double aWithdraw){
		if(aWithdraw > balance) {
			System.out.println("Insufficient Funds!");
		} else 
			
			balance = balance - aWithdraw;
			return balance;
			
		}
	//transfer method
	public double  transferFrom(Account account, double amount) {
		if (account.balance > amount){
			account.withdraw(amount);
				this.deposit(amount);
				return amount;
				
			} else 
				System.out.println("Transfer Fail!");
		return -1;
		}
		
	
	
	public int getId(){
		return id;
	}
	void setId(int anId){
		 this.id = anId;		
	}
	
	public void  print(){
		System.out.println("My balance is "+this.getBalance());
	}
	
	//getter for description
	String getDescription() {
		  return description;
		}
	//setter for description
	void setDescription(String aDescription) {
		  this.description = aDescription;
		}

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
		
	}



