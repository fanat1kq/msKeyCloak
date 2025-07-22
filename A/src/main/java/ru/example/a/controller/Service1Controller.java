package ru.example.a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Добавили префикс
public class Service1Controller {

    @GetMapping("/data")
    public String getData() {
        return "Data from Service1";
    }
}