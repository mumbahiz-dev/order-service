package com.order.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class PingController {

    @GetMapping("ping")
    public String ping() throws UnknownHostException {
        String address = InetAddress.getLocalHost().getHostName();
        return "Order Service Activated " + address;
    }
}
