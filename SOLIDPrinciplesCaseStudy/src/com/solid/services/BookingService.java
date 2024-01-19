package com.solid.services;

public class BookingService {
	private String servicesProvided;

	public String getServicesProvided() {
		return servicesProvided;
	}

	public void setServicesProvided(String servicesProvided) {
		this.servicesProvided = servicesProvided;
	}

	public BookingService() {
		servicesProvided = "Transport,Hotel,Restraunt,Tourist Places";
	}
	
}
