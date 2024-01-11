package lauragallace.BEW4D4;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeW4D4Application {

	public static void main(String[] args) {

		SpringApplication.run(BeW4D4Application.class, args);
		Faker faker = new Faker ();
		System.err.println(faker.dragonBall().character());
		System.err.println(faker.dragonBall().character());
		System.err.println(faker.dragonBall().character());
		System.err.println(faker.dragonBall().character());
	}

}
