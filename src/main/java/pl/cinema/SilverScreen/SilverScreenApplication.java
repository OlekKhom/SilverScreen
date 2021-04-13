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

	@PostConstruct
	public void test(){
		ticketRepository.save(new Ticket(0,10, 23.5));
	}
}
