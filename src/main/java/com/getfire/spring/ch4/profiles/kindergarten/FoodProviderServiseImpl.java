package com.getfire.spring.ch4.profiles.kindergarten;

import com.getfire.spring.ch4.profiles.Food;
import com.getfire.spring.ch4.profiles.FoodProvidersService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiseImpl implements FoodProvidersService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));
        return lunchSet;
    }
}
