package com.solid.utility;

import java.util.Scanner;

import com.solid.entity.*;
import com.solid.interfaces.ServiceProviderCreation;
import com.solid.services.AdminAccountServices;
import com.solid.services.BookingService;
import com.solid.services.CustomerAccountServices;
import com.solid.services.CustomerCreation;
import com.solid.services.ServiceProviderAccountServices;

public class MainUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Travel Booking Page");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		int userType;
		System.out.println("Enter Type of User You Want To Be:\n1.Customer, 2.Service Provider, 3.Admin\nEnter your choice");
		userType = scanner.nextInt();
		scanner.nextLine();
		Customer customer = null;
		ServiceProvider serviceProvider = null;
		Admin admin = new Admin();
		
		switch(userType) {
		case 1: customer = CustomerCreation.customerCreation();
		
		System.out.println("Review your account details:");
		System.out.println(customer.getUserId());
		System.out.println(customer.getUsername());
		System.out.println(customer.getEmailId());
		System.out.println(customer.getMobileNumber());
		System.out.println(customer.getSecurityQuestion());
		System.out.println(customer.getSecurityAnswer());
		System.out.println(customer.getCustomerFirstName());
		System.out.println(customer.getCustomerLastName());
		System.out.println(customer.getCustomerAddress());
		System.out.println(customer.getCustomerPaymentDetails());
		
		System.out.println("Services Provided are:");
		CustomerAccountServices.customerAccountServices(customer);
		break;
		
		case 2:	serviceProvider = ServiceProviderCreation.serviceProviderCreation();
		System.out.println("Review your account details:");
		System.out.println(serviceProvider.getUserId());
		System.out.println(serviceProvider.getUsername());
		System.out.println(serviceProvider.getEmailId());
		System.out.println(serviceProvider.getMobileNumber());
		System.out.println(serviceProvider.getSecurityQuestion());
		System.out.println(serviceProvider.getSecurityAnswer());
		System.out.println(serviceProvider.getServiceProviderName());
		System.out.println(serviceProvider.getServiceProviderAddress());
		System.out.println(serviceProvider.getServiceProviderContact());
		System.out.println(serviceProvider.getServicesProvided());
		
		System.out.println("Services Provided are:");
		ServiceProviderAccountServices.serviceProviderAccountServices(serviceProvider);
		break;
		
		case 3: admin = new Admin();
		System.out.println("Has admin power to: Register User");
		AdminAccountServices.adminAccountServices();
		
		default: System.out.println("Wrong choice!!");
		}
	}
}
