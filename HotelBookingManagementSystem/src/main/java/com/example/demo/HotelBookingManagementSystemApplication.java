package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Hotel;
import com.example.demo.service.BookingService;

@SpringBootApplication
public class HotelBookingManagementSystemApplication implements CommandLineRunner{
	
	@Autowired
	private BookingService bookingService;

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer customer = Customer.builder()
				.customerId(101)
				.customerName("Pratap Tanaji Kachare")
				.city("Pune")
				.build();
		
		Hotel hotel = Hotel.builder()
				.hotelId(001)
				.hotelName("Taj Hotel")
				.location("Pune")
				.build();
		
		Booking booking = Booking.builder()
				.bookingId(1001)
				.roomType("Delux Room")
				.amount(5500)
				.customer(customer)
				.hotel(hotel)
				.build();
				
		bookingService.DisplayBooking(booking);
				
	}

}
