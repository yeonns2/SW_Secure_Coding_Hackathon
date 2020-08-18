package com.securessingssing.controller;

import com.securessingssing.exceptions.ForbiddenException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("/internalerror")
    public void internalerror() {
        throw new RuntimeException("500 Internal Error !!");
    }

    @GetMapping("/forbidden")
    public void forbidden() {
        throw new ForbiddenException("403 Forbidden !!");
    }
}
