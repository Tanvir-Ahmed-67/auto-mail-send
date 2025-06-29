package frd.automail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AutomailApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomailApplication.class, args);
	}

}
