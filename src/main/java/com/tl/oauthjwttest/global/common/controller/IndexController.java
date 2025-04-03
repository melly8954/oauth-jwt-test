package com.tl.oauthjwttest.global.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {
    @GetMapping("/")
    public String indexAPI() {
        return "Index Route";
    }
}

