package com.example.tarea2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController(){

        peliculas.add(new Pelicula(1, "Titanic", 1997, "James Cameron", "Romance", "Romance trágico en barco"));
        peliculas.add(new Pelicula(2, "Star Wars: Episodio I - La Amenaza Fantasma", 1999, "George Lucas", "Ciencia ficción", "Comienzo de la saga galáctica"));
        peliculas.add(new Pelicula(3, "Avatar ", 2009, "James Cameron", "Ciencia ficción", "Conexión con Pandora"));
        peliculas.add(new Pelicula(4, "El Caballero de la Noche", 2008, "Christopher Nolan", "Acción", "Batman contra Joker"));
        peliculas.add(new Pelicula(5, "Joker ", 2019, "Todd Phillips", "Drama", "Origen del Joker"));
    }
    
    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    @GetMapping("/pelicula/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for(Pelicula pelicula: peliculas){
            if(pelicula.getId() == id)
            {
                return pelicula;
            }
        }
       e
    }
    
}
