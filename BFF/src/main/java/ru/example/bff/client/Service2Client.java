package ru.example.bff.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.example.bff.conf.FeignConfig;

@FeignClient(name = "service2", url = "${serviceb.url}", configuration = FeignConfig.class)
public interface Service2Client {
    @GetMapping("/api/data")
    String getData();
}