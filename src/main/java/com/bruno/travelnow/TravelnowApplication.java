package com.bruno.travelnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravelnowApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelnowApplication.class, args);
	}
}
