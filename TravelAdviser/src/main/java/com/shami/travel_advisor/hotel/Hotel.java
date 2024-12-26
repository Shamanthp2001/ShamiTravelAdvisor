package com.shami.travel_advisor.hotel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
@Setter
@Getter
@NoArgsConstructor //for JPA /JDBC to interact with replication
@AllArgsConstructor // for update other attributes in hotel to access
@Entity //table name default taken class name
//@Table(name = "hotel_table") // if you want to change name of tble
public class Hotel {

    @Id // Primary Key
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String location;
    private LocalTime inTime;
    private LocalTime outTime;
    private Integer price;
}
