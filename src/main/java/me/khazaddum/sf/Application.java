package me.khazaddum.sf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* Search for components inside a specific package:
 * @SpringBootApplication(scanBasePackages = "me.khazaddum.sf.component.impl")
 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
