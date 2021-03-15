package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao dao ;

    @Override
    public List<Car> getCar() {
        return dao.getCar();
    }

    public  List<Car> getSomeCars(int number, List<Car> cars) {
        return  dao.getSomeCars(number,cars);
    }
}
