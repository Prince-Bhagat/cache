package com.prince.cache.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cache {
    @GetMapping("/count")
    ResponseEntity<Integer> count(){
        return ResponseEntity.ok(100);
    }
}


