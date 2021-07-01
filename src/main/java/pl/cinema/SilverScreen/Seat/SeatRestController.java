package pl.cinema.SilverScreen.Seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.Seat.model.SeatHttpRequest;
import pl.cinema.SilverScreen.Seat.model.SeatHttpResponse;

import java.util.List;

@RestController
public class SeatRestController {

    @Autowired
    SeatService seatService;

    @Autowired
    public SeatRestController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/seats/{id}")
    public SeatHttpResponse getSeat(@PathVariable long id) {
        return seatService.getSeat(id);
    }

    @GetMapping("/seats")
    public List<SeatHttpResponse> getAllSeats() {
        return seatService.getAllSeats();
    }

    @PostMapping("/seats")
    public String create(@RequestBody SeatHttpRequest request) {
        return seatService.create(request);
    }

    @PutMapping("/seats/{id}")
    public String update(@PathVariable long id, @RequestBody SeatHttpRequest request) {
        return seatService.update(id, request);
    }

    @DeleteMapping("/seats/{id}")
    public Boolean delete(@PathVariable long id) {
        return seatService.delete(id);
    }
}

/*@PutMapping("/seat/{numberSeat}")
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
    }*/
