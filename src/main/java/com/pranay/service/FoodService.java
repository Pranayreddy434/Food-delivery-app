package com.pranay.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranay.model.FoodItem;
import com.pranay.repository.FoodItemRepository;

import java.util.List;



@Service
public class FoodService {

    @Autowired
    private FoodItemRepository foodRepository;

    public List<FoodItem> getAllFoodItems() {
        return foodRepository.findAll();
    }

    public FoodItem saveFoodItem(FoodItem foodItem) {
        return foodRepository.save(foodItem);
    }
}
