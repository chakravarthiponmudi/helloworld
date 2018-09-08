package com.chakraonjjava.HelloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    String sayHello(){
        return "Hello World!!!";
    } }