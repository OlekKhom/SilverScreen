package pl.cinema.SilverScreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Client.ClientRepository;
import pl.cinema.SilverScreen.Film.model.Film;
import pl.cinema.SilverScreen.Film.FilmRepository;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoom;
import pl.cinema.SilverScreen.MoviesRoom.MoviesRoomRepository;
import pl.cinema.SilverScreen.Seat.model.Seat;
import pl.cinema.SilverScreen.Seat.SeatRepository;
import pl.cinema.SilverScreen.Ticket.model.Ticket;
import pl.cinema.SilverScreen.Ticket.TicketRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SilverScreenApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SilverScreenApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SilverScreenApplication.class);
	}

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	FilmRepository filmRepository;

	@Autowired
	MoviesRoomRepository moviesRoomRepository;

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	SeatRepository seatRepository;

	@PostConstruct
	public void testTicketManyToOneClient() {

		Ticket ticket1 = ticketRepository.save(new Ticket(0, 15, 20));
		Ticket ticket2 = ticketRepository.save(new Ticket(0, 20, 35));
		Ticket ticket3 = ticketRepository.save(new Ticket(0, 25, 25));

		Client client1 = clientRepository.save(
				new Client(0, "Tom", 123456, List.of(ticket1, ticket2, ticket3))
		);

		ticket1.setClient(client1);
		ticket2.setClient(client1);
		ticket3.setClient(client1);
		ticketRepository.save(ticket1);
		ticketRepository.save(ticket2);
		ticketRepository.save(ticket3);
	}

	@PostConstruct
	public void testTicketManyToOneFilm() {

		Ticket ticket1 = ticketRepository.save(new Ticket(0, 100, 5.55));
		Ticket ticket2 = ticketRepository.save(new Ticket(0, 110, 10.55));
		Ticket ticket3 = ticketRepository.save(new Ticket(0, 120, 15.55));

		Film film1 = filmRepository.save(
				new Film(0, "Forrest Gump", "Thom Hanks",1994, 123, List.of(ticket1, ticket2, ticket3))
		);

		ticket1.setFilm(film1);
		ticket2.setFilm(film1);
		ticket3.setFilm(film1);
		ticketRepository.save(ticket1);
		ticketRepository.save(ticket2);
		ticketRepository.save(ticket3);
	}

	@PostConstruct
	public void testTicketOneToOneSeat() {

		Seat seat1 = seatRepository.save(new Seat(0, 1, false));
		Ticket ticket1 = ticketRepository.save(new Ticket(0, 1001, 35.8, seat1));

		seat1.setTicket(ticket1);
		seatRepository.save(seat1);
	}

	@PostConstruct
	public void testTicketManyToOneMoviesRoom() {

		Ticket ticket1 = ticketRepository.save(new Ticket(0, 5, 50));
		Ticket ticket2 = ticketRepository.save(new Ticket(0, 50, 50));
		Ticket ticket3 = ticketRepository.save(new Ticket(0, 70, 70.5));

		MoviesRoom moviesRoom1 = moviesRoomRepository.save(new MoviesRoom(0, 1, 120, "3D", List.of(ticket1, ticket2, ticket3)));

		ticket1.setMoviesRoom(moviesRoom1);
		ticket2.setMoviesRoom(moviesRoom1);
		ticket3.setMoviesRoom(moviesRoom1);
		ticketRepository.save(ticket1);
		ticketRepository.save(ticket2);
		ticketRepository.save(ticket3);
	}

	@PostConstruct
	public void testFilmManyToManyMoviesRoom() {

		Film film1 = filmRepository.save(
				new Film(0, "Interstellar", "Matthew McConaughey",2014, 142)
		);
		Film film2 = filmRepository.save(
				new Film(0, "Green book", "Viggo Mortensen",2018, 115)
		);

		MoviesRoom moviesRoom1 = moviesRoomRepository.save(new MoviesRoom(0, 1, 120, "3D"));
		MoviesRoom moviesRoom2 = moviesRoomRepository.save(new MoviesRoom(0, 2, 100, "3D"));

		film1.setMoviesRooms(Set.of(moviesRoom1));
		film2.setMoviesRooms(Set.of(moviesRoom2));

		filmRepository.save(film1);
		filmRepository.save(film2);
	}
}
