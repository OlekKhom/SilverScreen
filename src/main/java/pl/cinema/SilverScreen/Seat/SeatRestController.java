package pl.cinema.SilverScreen.Seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SeatRestController {

    @Autowired
    SeatRepository seatRepository;

    @PutMapping("/seat/{numberSeat}")
    public String seatPut(@PathVariable int numberSeat) {
        ArrayList<Integer> occupiedSeats = new ArrayList<> ();
        occupiedSeats.add(1);
        occupiedSeats.add(10);
        occupiedSeats.add(20);
        boolean isFree = true;
        for (int i : occupiedSeats) {
            if (i == numberSeat) {
                isFree = false;
            }
        }
        if (isFree) {
            occupiedSeats.add(numberSeat);
            return "Welcome to Film";
        }
        return "Seat is occupied";
    }

}
