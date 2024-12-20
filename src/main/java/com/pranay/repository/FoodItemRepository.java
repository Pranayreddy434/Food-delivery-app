package com.pranay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranay.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
