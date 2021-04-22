package pl.cinema.SilverScreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.cinema.SilverScreen.Client.Client;
import pl.cinema.SilverScreen.Client.ClientRepository;
import pl.cinema.SilverScreen.Film.Film;
import pl.cinema.SilverScreen.Film.FilmRepository;
import pl.cinema.SilverScreen.MoviesRoom.MoviesRoom;
import pl.cinema.SilverScreen.MoviesRoom.MoviesRoomRepository;
import pl.cinema.SilverScreen.Ticket.Ticket;
import pl.cinema.SilverScreen.Ticket.TicketRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SilverScreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilverScreenApplication.class, args);
	}

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	FilmRepository filmRepository;

	@Autowired
	MoviesRoomRepository moviesRoomRepository;

	@Autowired
	ClientRepository clientRepository;

	@PostConstruct
	public void test1() {

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
	public void test2() {

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
}
