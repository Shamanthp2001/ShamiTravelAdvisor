package com.shami.travel_advisor.hotel;

import java.util.List;

public interface HotelService {
    void createHotel(Hotel hotel);
    List<Hotel> findAllHotels();
}
