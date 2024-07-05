package com.dt.learningtrial.learningtrialbookingjpa.june18and23.service;

import com.dt.learningtrial.learningtrialbookingjpa.june18and23.entities.Booking;
import com.dt.learningtrial.learningtrialbookingjpa.june18and23.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepo bookingRepo;

    public Booking addBooking(Booking booking) {
        //some logics are implemented by hibernate, so 'save' logic is gifted hibernate.
        bookingRepo.save(booking);

        return booking;
    }

    public List<Booking> getAllBookings(){
        return bookingRepo.findAll();
    }

    public Optional<Booking> getBookingById(Long id){
        //its Optional, coz it might be sometime not return as booking might not available.
        return bookingRepo.findById(id);
    }

    public Optional<Booking> findByCategory(String category){
        return bookingRepo.findByCategory(category);
    }

    public List<Booking> findByLocation(String location){
        return bookingRepo.findByLocation(location);
    }
}
