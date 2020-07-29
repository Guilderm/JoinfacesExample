package com.example.BootPrimeFacesCDIExample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {
    @GetMapping("/")
    public String homePage() {
        return "\\index.xhtml";
    }
}
