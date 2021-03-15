package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/cars")
    public String LoopCar(Model model,@RequestParam(value = "count", required = false,defaultValue = "5") int count){

        model.addAttribute("cars", service.getSomeCars(count,service.getCar()));
        return "cars";
    }
}
