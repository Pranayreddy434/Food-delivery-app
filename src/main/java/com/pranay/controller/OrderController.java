package com.pranay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pranay.model.Order;
import com.pranay.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Option 1: Map to root level confirmation
    @GetMapping("/confirmation")
    public String orderConfirmation() {
        return "order_confirmation";
    }

    // Option 2: Keep it under /order but add a redirect from root
    @GetMapping("/order/confirmation")
    public String orderConfirmationWithPath() {
        return "order_confirmation";
    }

    @PostMapping("/order/place-order")
    @ResponseBody
    public String placeOrder(@RequestBody Order order) {
        boolean success = orderService.saveOrder(order);
        if (success) {
            return "{\"success\": true, \"message\": \"Order placed successfully!\"}";
        } else {
            return "{\"success\": false, \"message\": \"Error placing order.\"}";
        }
    }
}