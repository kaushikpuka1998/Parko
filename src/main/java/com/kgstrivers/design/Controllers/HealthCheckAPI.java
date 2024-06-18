package com.kgstrivers.design.Controllers;

import com.kgstrivers.design.Entities.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckAPI {

    @GetMapping("/health")
    public ResponseEntity healthCheck() {
        Response response = new Response<String>( HttpStatus.OK, "Service is up and running!");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
