package com.demo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index", "/index.html"})
    public String home() {
        return "index";
    }

    @GetMapping({"/login", "/login.html"})
    public String loginPage() {
        return "login";
    }

    @GetMapping({"/register", "/register.html"})
    public String registerPage() {
        return "register";
    }

    @GetMapping({"/products", "/products.html"})
    public String productsPage() {
        return "products";
    }

    @GetMapping({"/admin", "/admin.html"})
    public String adminPage() {
        return "admin";
    }
}