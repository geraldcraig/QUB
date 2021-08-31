package cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cardatabase.domain.Car;
import cardatabase.domain.CarRepository;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000));
			
		};
	}
}
