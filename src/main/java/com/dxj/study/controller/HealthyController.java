package com.dxj.study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/healthz")
@RestController
public class HealthyController {

    @GetMapping
    public ResponseEntity<String> healthy() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
