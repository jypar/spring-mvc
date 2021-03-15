package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCar();
    List<Car> getSomeCars(int number, List<Car> cars);
}
