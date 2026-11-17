package com.first.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "bay", method = RequestMethod.GET)
    public ResponseEntity<?> bay() {
        return new ResponseEntity<>("bay World!", HttpStatus.OK);
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ResponseEntity<?> hello() {
        return new ResponseEntity<>("hello World!", HttpStatus.OK);
    }
}