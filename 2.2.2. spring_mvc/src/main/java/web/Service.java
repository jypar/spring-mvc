package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<Car> getCars(int number, List<Car> cars) {

        List<Car> list = new ArrayList<>();
        for(int i=0; i<number;i++){
            list.add(cars.get(i));
        }
        return list;

    }
}
