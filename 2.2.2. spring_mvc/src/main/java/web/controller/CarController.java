package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String LoopCar(Model model,@RequestParam(value = "count", required = false) int count){

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

        model.addAttribute("cars", Service.getCars(count,list));

        return "cars";
    }
}
