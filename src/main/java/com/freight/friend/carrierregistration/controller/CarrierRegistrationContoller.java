package com.freight.friend.carrierregistration.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(CarrierRegistrationPathConstants.CARRIER_REGISTRATION_API_PATH)
public class CarrierRegistrationContoller {
    @ApiOperation(value = "Health check",
            notes = "Returns the name of the service that indicates the service is up and running.",
            httpMethod = "GET",
            nickname = "carrierRegistrationHealthCheck")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String carrierRegistrationHealthCheck() {
        return "Carrier Registration service is running!";
    }
}
