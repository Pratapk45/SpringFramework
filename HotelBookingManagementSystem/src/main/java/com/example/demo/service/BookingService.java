package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;

@Service
public class BookingService {

	public void DisplayBooking(Booking booking) {

		System.out.println("===== BOOKING DETAILS =====");
		System.out.println("Booking Id :" + booking.getBookingId());
		System.out.println("Room Type :" + booking.getRoomType());
		System.out.println("Ammount :" + booking.getAmount());

		System.out.println("\n===== CUSTOMER DETAILS =====");
		
		System.out.println("Customer Id :"+booking.getCustomer().getCustomerId()); 
		System.out.println("Customer Name :"+booking.getCustomer().getCustomerName());
		System.out.println("City :"+booking.getCustomer().getCity());
		
		
		 System.out.println("\n===== HOTEL DETAILS =====");

	        System.out.println("Hotel Id: "
	                + booking.getHotel().getHotelId());

	        System.out.println("Hotel Name: "
	                + booking.getHotel().getHotelName());

	        System.out.println("Location: "
	                + booking.getHotel().getLocation());

	}

}
