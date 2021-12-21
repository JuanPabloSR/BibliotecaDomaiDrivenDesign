package co.com.sofka.Biblioteca.domain.libro;

import co.com.sofka.Biblioteca.domain.libro.events.CategoriaAgregada;
import co.com.sofka.Biblioteca.domain.libro.events.LibroCreado;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CambiarLibro extends EventChange {
    public CambiarLibro(Libro libro) {
        apply((LibroCreado event) -> {
            libro.autores = new HashSet<>();
            libro.categorias = new HashSet<>();
            libro.titulo=event.getTitulo();
            libro.year=event.getYear();
        });
        apply((CategoriaAgregada event) -> {

        });

    }
}
