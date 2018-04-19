package com.cars.demo.user.controller;

import com.cars.demo.user.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public Country findById(@PathVariable Long id){
        Country country = restTemplate.getForObject("http://localhost:8100/provider/country/1",Country.class);
        return country;
    }
}
