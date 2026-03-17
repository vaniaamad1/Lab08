package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

// Lab 8 TDD starter code
public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        cities.remove(city);
    }
}
