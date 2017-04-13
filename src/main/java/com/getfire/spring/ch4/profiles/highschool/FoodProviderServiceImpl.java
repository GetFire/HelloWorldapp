package com.getfire.spring.ch4.profiles.highschool;

import com.getfire.spring.ch4.profiles.Food;
import com.getfire.spring.ch4.profiles.FoodProvidersService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProvidersService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));
        return lunchSet;
    }
}
