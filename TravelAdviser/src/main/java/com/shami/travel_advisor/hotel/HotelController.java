package com.shami.travel_advisor.hotel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    private final HotelService hotelService;
    public HotelController(HotelService hotelService) {
       this.hotelService = hotelService;
    }
    @PostMapping("/travel/hotel")
    public String createHotel(@RequestBody Hotel hotel){
        hotelService.createHotel(hotel);
        return "Hotel Added Successfully";
    }
    @GetMapping("/travel/hotel")
    public List<Hotel> findAllHotels(){
        return hotelService.findAllHotels();
    }
}
