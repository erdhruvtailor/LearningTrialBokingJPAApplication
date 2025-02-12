package com.dt.learningtrial.learningtrialbookingjpa.june18and23.api;

import com.dt.learningtrial.learningtrialbookingjpa.june18and23.entities.Booking;
import com.dt.learningtrial.learningtrialbookingjpa.june18and23.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingApi {

    @Autowired
    BookingService bookingService;

    @PostMapping("/SaveBooking/{dummyPathVariable}")
    public Booking experimentOfPostMethod(@PathVariable("dummyPathVariable") String bookingName,
                                          @RequestParam(value="dummy",required = false) String dummy,
                                          @RequestBody Booking booking
                                         ){

        return bookingService.addBooking(booking);

    }

    @GetMapping("/allBookings")
    public List<Booking> getAllBookings() {

        return bookingService.getAllBookings();

    }

    @GetMapping("/getBookingByLocation/{byLocation}")
    public List<Booking> getBookingByLocation(@PathVariable("byLocation") String location){
        return bookingService.findByLocation(location);
    }

    @GetMapping("/getBookingByLocationUsingReqParam")
    public List<Booking> getBookingByLocationUsingReqParam(@RequestParam String location){
        return bookingService.findByLocation(location);
    }

}
