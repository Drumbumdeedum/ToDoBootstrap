package com.greenfox.dszalay.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoBootstrapApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ToDoBootstrapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
