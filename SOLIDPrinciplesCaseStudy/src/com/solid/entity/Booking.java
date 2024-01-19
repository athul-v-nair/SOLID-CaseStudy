package com.solid.entity;

public class Booking {
	private String BookingId;

	public String getBookingId() {
		return BookingId;
	}

	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}

	public Booking() {
		BookingId = "BI100";
	}

	@Override
	public String toString() {
		return "Booking [BookingId=" + BookingId + "]";
	}
	
}
