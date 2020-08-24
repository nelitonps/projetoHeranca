package application;

import entities.BusinessAcount;

public class Program {

	public static void main(String[] args) {
	
		BusinessAcount account = new BusinessAcount(8010, "Bob Brown", 10.0, 500.0);

		System.out.println("Balance: " + account.getBalance());
		
	}

}
