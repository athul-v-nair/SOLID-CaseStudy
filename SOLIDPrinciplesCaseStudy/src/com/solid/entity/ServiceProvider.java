package com.solid.entity;

import java.util.ArrayList;

import com.solid.interfaces.ServiceProviderActions;
import com.solid.services.BookingService;

public class ServiceProvider extends User implements ServiceProviderActions {
	private String serviceProviderName;
	private String serviceProviderAddress;
	private String serviceProviderContact;
	private ArrayList<BookingService> servicesProvided;
	public String getServiceProviderName() {
		return serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public String getServiceProviderAddress() {
		return serviceProviderAddress;
	}
	public void setServiceProviderAddress(String serviceProviderAddress) {
		this.serviceProviderAddress = serviceProviderAddress;
	}
	public String getServiceProviderContact() {
		return serviceProviderContact;
	}
	public void setServiceProviderContact(String serviceProviderContact) {
		this.serviceProviderContact = serviceProviderContact;
	}
	public ArrayList<BookingService> getServicesProvided() {
		return servicesProvided;
	}
	public void setServicesProvided(ArrayList<BookingService> servicesProvided) {
		this.servicesProvided = servicesProvided;
	}
	
	
	public ServiceProvider(String userId, String username, String emailId, String password, String mobileNumber,
			String securityQuestion, String securityAnswer, String serviceProviderName, String serviceProviderAddress, String serviceProviderContact,
			ArrayList<BookingService> servicesProvided) {
		super(userId, username, emailId, password, mobileNumber, securityQuestion, securityAnswer);
		this.serviceProviderName = serviceProviderName;
		this.serviceProviderAddress = serviceProviderAddress;
		this.serviceProviderContact = serviceProviderContact;
		this.servicesProvided = servicesProvided;
	}
	@Override
	public void cancel() {
		System.out.println("Service Provider can cancel booking");
	}
}
