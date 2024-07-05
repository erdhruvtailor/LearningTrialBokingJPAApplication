package com.dt.learningtrial.learningtrialbookingjpa.june18and23.api;

import com.dt.learningtrial.learningtrialbookingjpa.june18and23.entities.Booking;
import com.dt.learningtrial.learningtrialbookingjpa.june18and23.service.BookingService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/roughDemo")
public class RoughDemoApi {

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

    @GetMapping("/hello/{name}")
    public String experimentWithPathVariable(@PathVariable("name") String bookingName, @RequestParam() String category, @RequestParam(value="dummy",required = false) String dummy){
        dummy = "  loremipsu  ";

        if(Objects.nonNull(dummy.trim())) {
            System.out.println("I am good!");
        } else {
            System.out.println("I am not Good!");
        }

        if(StringUtils.isNotEmpty(dummy)) {
            System.out.println("I am good!");
        } else {
            System.out.println("I am not Good!");
        }

        return bookingName + " " + category + " " + dummy;
    }

    @PostMapping("/hello/{name}")
    public String experimentOfPostMethod(@PathVariable("name") String bookingName,
                                         @RequestParam() String category,
                                         @RequestParam(value="dummy",required = false) String dummy,
//                                         @RequestBody String message,
//                                         @RequestBody User user,
                                         @RequestBody Booking booking
                                         ){


//        System.out.println(message);
//        System.out.println(user.getMsg());
        System.out.println(booking.getName());

        return "Ok!";
    }
}
