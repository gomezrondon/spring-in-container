package com.gomezrondon.springincontainer;

import com.gomezrondon.springincontainer.entitie.TimeEntity;
import com.gomezrondon.springincontainer.repository.TimeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

/*	private final TimeRepository repo;


	public Application(TimeRepository repo) {
		this.repo = repo;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

/*		TimeEntity time = new TimeEntity(LocalDateTime.now().toString());
		repo.save(time);
		List<TimeEntity> all = repo.findAll();
		all.forEach(System.out::println);*/

	}
}
