package com.example.odin.controllers;

import com.example.odin.calculator.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/add")
    public int add(@RequestParam int i, @RequestParam int j) {
        return Calculator.add(i, j);
    }


}
