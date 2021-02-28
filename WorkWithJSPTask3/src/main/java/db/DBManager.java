package db;

import entities.Cars;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Cars> cars = new ArrayList<>();
    private static Long id = 6L;

    static {
        cars.add(new Cars(1L, "Mercedes", 220));
        cars.add(new Cars(2L, "Toyota", 210));
        cars.add(new Cars(3L, "Lexus", 230));
        cars.add(new Cars(4L, "BMW", 240));
        cars.add(new Cars(5L, "Escalade", 330));
    }

    public static ArrayList<Cars> getCars() {
        return cars;
    }

    public static Cars getCar(Long id){
        for(Cars c : cars){
            if(c.getId()==id){
                return c;
            }
        }
        return null;
    }

    public static void addCar(Cars car){
        car.setId(id);
        cars.add(car);
        id++;
    }

    public static void deleteCar(Long id){
        for(int i=0;i<cars.size();i++){
            if(cars.get(i).getId()==id){
                cars.remove(i);
            }
        }
    }

}