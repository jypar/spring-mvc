package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCar() {
        Car car1 =new Car(1,"panamera",4);
        Car car2 =new Car(2,"audi",3);
        Car car3 =new Car(3,"bmw",5);
        Car car4 =new Car(4,"honda",9);
        Car car5 =new Car(5,"toyota",6);
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        return list;
    }

    @Override
    public List<Car> getSomeCars(int number, List<Car> cars) {
        List<Car> list = new ArrayList<>();
        for(int i=0; i<number;i++){
            list.add(cars.get(i));
        }
        return list;
    }
}
