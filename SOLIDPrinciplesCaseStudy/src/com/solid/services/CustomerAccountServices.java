package com.solid.services;

import java.util.Scanner;

import com.solid.entity.Admin;
import com.solid.entity.Customer;
import com.solid.interfaces.UserActions;

public class CustomerAccountServices {
	public static void customerAccountServices(Customer customer) {
		int options;
		char ch;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1.View your previous bookings, 2.View available actions");
			options = scanner.nextInt();
			scanner.nextLine();
			switch(options) {
			case 1: System.out.println(customer.getCustomerBookings());
				break;
			case 2: System.out.println("Available actions:");
				customer.book();
				customer.cancel();
			}
			System.out.println("Do you want to continue(y/n):");
			ch = scanner.next().charAt(0);
			scanner.nextLine();
		}while(ch=='y'||ch=='Y');
	}
}
