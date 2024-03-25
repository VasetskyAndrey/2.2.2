package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {

        List<String> messages = new ArrayList<>();

        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");

        model.addAttribute("messages", messages);

        return "index";
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("audi", "black", 52642));
        cars.add(new Car("mercedes", "red", 57123));
        cars.add(new Car("bmw", "green", 45678));
        cars.add(new Car("volvo", "blue", 32456));
        cars.add(new Car("ford", "white", 32456));

        return "cars";
    }

}