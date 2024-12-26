package com.shami.travel_advisor.hotel;

import java.time.LocalTime;
public class Hotel {
    private Integer id;
    private String name;
    private String location;
    private LocalTime inTime;
    private LocalTime outTime;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalTime getInTime() {
        return inTime;
    }

    public LocalTime getOutTime() {
        return outTime;
    }

    public Integer getPrice() {
        return price;
    }


    public Hotel(Integer id, String name, String location, LocalTime inTime, LocalTime outTime, Integer price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.inTime = inTime;
        this.outTime = outTime;
        this.price = price;
    }

}
