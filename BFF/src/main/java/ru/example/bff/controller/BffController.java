package ru.example.bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.bff.client.Service1Client;
import ru.example.bff.client.Service2Client;

@RestController
public class BffController {

    private final Service1Client service1Client;
    private final Service2Client service2Client;

    public BffController(Service1Client service1Client, Service2Client service2Client) {
        this.service1Client = service1Client;
        this.service2Client = service2Client;
    }


    // Обработчик корневого пути
    @GetMapping("/")
    public String home() {
        return "Use /service1/data or /service2/data endpoints";
    }

    // Прокси к Service1
    @GetMapping("/service1/data")
    public String getService1Data() {
        return service1Client.getData();
    }

    // Прокси к Service2
    @GetMapping("/service2/data")
    public String getService2Data() {
        return service2Client.getData();
    }
}