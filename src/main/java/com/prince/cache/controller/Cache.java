package com.prince.cache.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Cache {
    @GetMapping("/count")
    ResponseEntity<Integer> count(@RequestParam Integer val){
        return ResponseEntity.ok(val);
    }
}


