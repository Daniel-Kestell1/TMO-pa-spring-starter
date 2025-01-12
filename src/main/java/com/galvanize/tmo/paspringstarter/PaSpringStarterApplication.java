package com.galvanize.tmo.paspringstarter;

import com.tmo.books.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PaSpringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaSpringStarterApplication.class, args);
	}

}
