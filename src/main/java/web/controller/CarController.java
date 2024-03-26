package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServ;

@Controller
public class CarController {

    private final CarServ carServ;

    @Autowired
    public CarController(@Qualifier("carServImpl") CarServ carServ) {
        this.carServ = carServ;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {

        model.addAttribute("cars", carServ.getCars(count));

        return "cars";
    }


}
