package com.shami.travel_advisor.hotel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HotelServiceImplementor implements HotelService {
    private final List<Hotel> hotels=new ArrayList<>();

    @Override
    public void createHotel(Hotel hotel) {
        this.hotels.add(hotel);

    }

    @Override
    public List<Hotel> findAllHotels() {
        return this.hotels;
    }
}
