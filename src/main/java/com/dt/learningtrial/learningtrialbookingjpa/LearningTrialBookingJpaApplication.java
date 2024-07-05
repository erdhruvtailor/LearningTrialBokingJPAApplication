package com.dt.learningtrial.learningtrialbookingjpa;

import com.dt.learningtrial.learningtrialbookingjpa.june18and23.entities.Booking;
import com.dt.learningtrial.learningtrialbookingjpa.june18and23.service.BookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearningTrialBookingJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(LearningTrialBookingJpaApplication.class, args);

        BookingService bookingService = applicationContext.getBean(BookingService.class);
        bookingService.addBooking(Booking.builder().bookingId(1).category("car").location("Kitchener").name("Lenzy").build());
        bookingService.addBooking(Booking.builder().bookingId(2).category("bus").location("Toronto").name("Kailash").build());
        bookingService.addBooking(Booking.builder().bookingId(3).category("train").location("Stratford").name("Papad").build());

        Optional<Booking> bookingById = bookingService.getBookingById(3L);
        System.out.println("Booking Id: 3 :" + bookingById);
        List<Booking> getAllBookings= bookingService.getAllBookings();
        System.out.println("All Bookings: " + getAllBookings);

        Optional<Booking> getByCategory= bookingService.findByCategory("bus");
        System.out.printf("By Category:" +getByCategory);
    }

}
