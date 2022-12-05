package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {


    public List<Passenger> getPassenger(){
        List<Passenger> myPass = List.of(
                new Passenger("Mr", "Darragh", "123", 224233424234233L, 23),
                new Passenger("Mr", "Darragh2", "123", 242342342342344L, 53),
                new Passenger("Mr", "Darragh3", "123", 5562342342342342L, 98));
        return myPass;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPass = new Passenger("Mr", "Darragh", "123", 224233424234233L, 23);
        return myPass;
    }
}
