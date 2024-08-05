package dev.jorge.SolarSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolarSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolarSystemApplication.class, args);

	}

	@Override
	public String toString() {
		return "SolarSystemApplication []";
	}
}
