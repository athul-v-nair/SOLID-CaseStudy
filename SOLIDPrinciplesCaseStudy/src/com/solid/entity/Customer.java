package com.solid.entity;

import java.util.ArrayList;

import com.solid.interfaces.*;

public class Customer extends User implements CustomerActions {
	private String customerFirstName;
	private String customerLastName;
	private String customerAddress;
	private String customerPaymentDetails;
	private ArrayList<Booking> customerBookings;
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPaymentDetails() {
		return customerPaymentDetails;
	}
	public void setCustomerPaymentDetails(String customerPaymentDetails) {
		this.customerPaymentDetails = customerPaymentDetails;
	}
	public ArrayList<Booking> getCustomerBookings() {
		return customerBookings;
	}
	public void setCustomerBookings(ArrayList<Booking> customerBookings) {
		this.customerBookings = customerBookings;
	}
	
	
	public Customer(String userId, String username, String emailId, String password, String mobileNumber,
			String securityQuestion, String securityAnswer, String customerFirstName, String customerLastName,
			String customerAddress, String customerPaymentDetails, ArrayList<Booking> customerBookings) {
		super(userId, username, emailId, password, mobileNumber, securityQuestion, securityAnswer);
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAddress = customerAddress;
		this.customerPaymentDetails = customerPaymentDetails;
		this.customerBookings = customerBookings;
	}
	
	@Override
	public void cancel() {
		System.out.println("Customer can cancel booking");
	}
	@Override
	public void book() {
		System.out.println("Customer can make booking");	
	}
}