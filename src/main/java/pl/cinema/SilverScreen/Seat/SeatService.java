package pl.cinema.SilverScreen.Seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cinema.SilverScreen.Seat.model.Seat;
import pl.cinema.SilverScreen.Seat.model.SeatHttpRequest;
import pl.cinema.SilverScreen.Seat.model.SeatHttpResponse;
import pl.cinema.SilverScreen.Seat.model.SeatMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatService {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public boolean existsByNumberSeat(int numberSeat) {
        if (seatRepository.existsByNumberSeat(numberSeat)) {
            return true;
        }
        return false;
    }

    public boolean deleteByNumberSeat(int numberSeat) {
        if (seatRepository.existsByNumberSeat(numberSeat)) {
            seatRepository.deleteByNumberSeat(numberSeat);
            return true;
        }
        return false;
    }

    public boolean findByNumberSeat(int numberSeat) {
        if (seatRepository.findByNumberSeat(numberSeat)) {
            return true;
        }
        return false;
    }

    public long countAllByNumberSeat(int numberSeat) {
        return seatRepository.countAllByNumberSeat(numberSeat);
    }

    public SeatHttpResponse getSeat(long id) {
        Seat seat = seatRepository.findById(id).get();
        SeatHttpResponse responseSeat = SeatMapper.map(seat);
        return responseSeat;
    }

    public List<SeatHttpResponse> getAllSeats() {
        Iterable<Seat> seats = seatRepository.findAll();
        List<SeatHttpResponse> responseSeats = new ArrayList<>();
        for (Seat seat : seats) {
            responseSeats.add(SeatMapper.map(seat));
        }
        return responseSeats;
    }

    public boolean delete(long id) {
        if (seatRepository.existsById(id)) {
            seatRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String create (SeatHttpRequest seat) {
        Seat seatEntity = SeatMapper.map(seat);
        Seat save = seatRepository.save(seatEntity);
        return String.valueOf(save.getId());
    }

    public String update (long id, SeatHttpRequest seat) {
        Seat seatEntity = SeatMapper.map(seat);
        seatEntity.setId(id);
        Seat save = seatRepository.save(seatEntity);
        return String.valueOf(save.getId());
    }
}
