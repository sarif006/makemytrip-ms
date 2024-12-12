package com.example.makemytrip_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return "Please book train tickets from irctc with 20% off" ; }
}

