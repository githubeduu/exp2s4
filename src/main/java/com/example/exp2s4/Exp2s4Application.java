package com.example.exp2s4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.exp2s4.model.Pelicula;
import com.example.exp2s4.repository.PeliculaRepository;

@SpringBootApplication
public class Exp2s4Application {

	public static void main(String[] args) {
		SpringApplication.run(Exp2s4Application.class, args);
	}
}
