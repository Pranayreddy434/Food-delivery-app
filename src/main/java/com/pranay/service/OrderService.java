package com.pranay.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranay.model.Order;
import com.pranay.repository.OrderRepository;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public boolean saveOrder(Order order) {
        try {
            orderRepository.save(order);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
