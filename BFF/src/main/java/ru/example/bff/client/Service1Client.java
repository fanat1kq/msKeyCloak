package ru.example.bff.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.example.bff.conf.FeignConfig;

@FeignClient(name = "service1", url = "${servicea.url}", configuration = FeignConfig.class)
public interface Service1Client {
    @GetMapping("/api/data")
    String getData();
}
