package com.shami.travel_advisor;

import com.shami.travel_advisor.hotel.Hotel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
public class TravelController {

    @GetMapping("/travel")
    public String getTravels() {
        return "Hello traveller";
    }

}
