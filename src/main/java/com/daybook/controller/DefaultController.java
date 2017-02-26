package com.daybook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String greeting() {
        return "daybook";
    }
}
