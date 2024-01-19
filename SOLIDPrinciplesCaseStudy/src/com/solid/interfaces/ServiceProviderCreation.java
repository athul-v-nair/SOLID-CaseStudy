package com.solid.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

import com.solid.entity.ServiceProvider;
import com.solid.services.BookingService;

public class ServiceProviderCreation {
	public static ServiceProvider serviceProviderCreation() {
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
		
		System.out.println("Enter Service Provider Name");
		String serviceProviderName = scanner.nextLine();
		System.out.println("Enter Service Provider Address");
		String serviceProviderAddress = scanner.nextLine();
		System.out.println("Enter Service Provider Contact");
		String serviceProviderContact = scanner.nextLine();
		BookingService bookingService = new BookingService();
		ArrayList<BookingService> bookingServiceList = new ArrayList<BookingService>();
		bookingServiceList.add(bookingService);
		
		ServiceProvider serviceProvider = new ServiceProvider("U100",username,emailId,password,mobileNumber,securityQuestion,securityAnswer,serviceProviderName,serviceProviderAddress,serviceProviderContact,bookingServiceList);
		return serviceProvider;
	}
}
