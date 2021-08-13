package com.kash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

        @GetMapping("/")
        public String handle(Model model) {
            model.addAttribute("message", "Hello World!");
            return "index";
        }
    }
