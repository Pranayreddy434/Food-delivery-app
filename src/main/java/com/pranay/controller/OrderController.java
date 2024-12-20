package com.pranay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.pranay.model.Order;
import com.pranay.service.OrderService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
@RequestMapping("/menu")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place-order")
    public String placeOrder(@RequestBody Order order) {
        boolean success = orderService.saveOrder(order);
        if (success) {
            return "{\"success\": true, \"message\": \"Order placed successfully!\"}";
        } else {
            return "{\"success\": false, \"message\": \"Error placing order.\"}";
        }
    }
}
