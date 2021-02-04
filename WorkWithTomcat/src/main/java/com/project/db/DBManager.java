package com.project.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Cars> allCars = new ArrayList<>();
    private static int id = 4;

    static {
        allCars.add(new Cars(1, "Mercedes", "E230", 10000, 2010));
        allCars.add(new Cars(2, "Toyota", "Tundra", 80000, 2018));
        allCars.add(new Cars(3, "Cadillac", "Escalade", 120000, 2021));
    }

    public static void addCar(Cars car){
        car.setId(id);
        allCars.add(car);
        id++;
    }

    public static ArrayList<Cars> getAllCars(){
        return allCars;
    }
}
