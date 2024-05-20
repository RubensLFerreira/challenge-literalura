package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.example.main.Main;
import org.example.repository.AuthorRepository;
import org.example.service.AuthorService;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

  @Autowired
  private AuthorRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(LiteraluraApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Main main = new Main(new AuthorService(repository));
    main.displayMenu();

  }
}
