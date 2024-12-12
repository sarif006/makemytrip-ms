package com.example.makemytrip_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday_package {
    @GetMapping("/holiday_package")
    public String getData() {return "Please book holiday_package with 25% off from ibibo " ; }
}