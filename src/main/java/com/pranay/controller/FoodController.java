package com.pranay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pranay.service.FoodService;

@Controller
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/menu")
    public String showMenu(Model model) {
        model.addAttribute("foodItems", foodService.getAllFoodItems());
        return "menu";
    }

    @GetMapping("/cart")
    public String showCart() {
        return "cart";
    }
}