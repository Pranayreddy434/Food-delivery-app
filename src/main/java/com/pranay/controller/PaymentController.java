package com.pranay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String paymentPage() {
        return "payment";
    }

    @GetMapping("/address")
    public String address() {
        return "address";
    }
}