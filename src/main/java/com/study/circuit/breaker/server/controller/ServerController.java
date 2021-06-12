package com.study.circuit.breaker.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ServerController {

    @GetMapping("/server/getStatus")
    public String getStatus() {
        return "Status sent from server !!";
    }
}
