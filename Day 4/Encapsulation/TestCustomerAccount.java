package com.finserv.java.Encapsulation;

public class TestCustomerAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setCid(1);
		c1.setCname("Uttej");
		Account account = c1.getaccount();
		account.setAccount_num(12234);
		account.setBalance(100000);
		System.out.println(c1.getCid() + " " + c1.getCname());

	}

}
