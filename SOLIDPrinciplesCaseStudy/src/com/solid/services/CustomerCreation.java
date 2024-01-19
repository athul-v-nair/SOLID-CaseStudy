package com.solid.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.solid.entity.Booking;
import com.solid.entity.Customer;

public class CustomerCreation {
	public static Customer customerCreation() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username = scanner.nextLine();
		System.out.println("Enter EmailId");
		String emailId = scanner.nextLine();
		System.out.println("Enter Password");
		String password = scanner.nextLine();
		System.out.println("Enter Mobile Number");
		String mobileNumber = scanner.nextLine();
		System.out.println("Enter Security Question");
		String securityQuestion = scanner.nextLine();
		System.out.println("Enter Answer to the question");
		String securityAnswer = scanner.nextLine();
		
		System.out.println("Enter Customer First Name");
		String customerFirstName = scanner.nextLine();
		System.out.println("Enter Customer Last Name");
		String customerLastName = scanner.nextLine();
		System.out.println("Enter Customer Address");
		String customerAddress = scanner.nextLine();
		System.out.println("Enter Customer Payment Details");
		String customerPaymentDetails = scanner.nextLine();
		//customer bookings
		ArrayList<Booking> customerBookingList = new ArrayList<Booking>();
		Booking booking = new Booking();
		customerBookingList.add(booking);
		
		Customer customer = new Customer("U100",username,emailId,password,mobileNumber,securityQuestion,securityAnswer,customerFirstName,customerLastName,customerAddress,customerPaymentDetails,customerBookingList);
		return customer;
	}
}
