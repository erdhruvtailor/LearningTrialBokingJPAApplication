package com.dt.learningtrial.learningtrialbookingjpa.api;

import com.dt.learningtrial.learningtrialbookingjpa.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingApi {

    @Autowired
    BookingService bookingService;

    @GetMapping("/hello")
    public String getBookingHomeEndPoint(){
            return "Hello Guests";
    }

    @RequestMapping(method = RequestMethod.GET, value = "hello2")
    public String getBookingHomeEndPoint2(){
        return "Hello Guests";
    }
}
