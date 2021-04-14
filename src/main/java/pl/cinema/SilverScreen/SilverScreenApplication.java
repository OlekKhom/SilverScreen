package pl.cinema.SilverScreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SilverScreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilverScreenApplication.class, args);
	}

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private MoviesRoomRepository moviesRoomRepository;

	@PostConstruct
	public void test(){
		ticketRepository.save(new Ticket(0,10, 23.5, new Client("Marta", 234234)));
		filmRepository.save(new Film(0,"Man X", "Hugh Michael Jackman", 2019, 107));
		moviesRoomRepository.save(new MoviesRoom(0, 2, 48, "Beats 6D"));
	}
}
