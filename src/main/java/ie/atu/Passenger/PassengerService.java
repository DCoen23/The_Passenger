package ie.atu.passenger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerService {


    public List<Passenger> getPassenger(){
        List<Passenger> myPass = List.of(
                new Passenger("Mr", "Darragh", "123", 1234567, 23),
                new Passenger("Mr", "Darragh2", "123", 1234567, 53),
                new Passenger("Mr", "Darragh3", "123", 1234567, 98));
        return myPass;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPass = new Passenger("Mr", "Darragh", "123", 1234567, 23);
        return myPass;
    }
}
