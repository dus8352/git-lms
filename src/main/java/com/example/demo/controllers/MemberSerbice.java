package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class MemberSerbice {
    @PostMapping("/users/1")
    public void join() {
        System.out.println("서버에 들어옴");
    }
}
