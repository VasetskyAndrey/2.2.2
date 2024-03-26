package web.service;


import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServImpl implements CarServ {
    @Override
     public List<Car> getCars(int count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("audi", "black", 52642));
        cars.add(new Car("mercedes", "red", 57123));
        cars.add(new Car("bmw", "green", 45678));
        cars.add(new Car("volvo", "blue", 32456));
        cars.add(new Car("ford", "white", 32456));

        if (count < 0 || count > cars.size()) {
            count = cars.size();
        }

        return cars.subList(0, count);

    }

}
