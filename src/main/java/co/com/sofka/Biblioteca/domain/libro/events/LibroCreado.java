package co.com.sofka.Biblioteca.domain.libro.events;

import co.com.sofka.Biblioteca.domain.libro.values.Titulo;
import co.com.sofka.domain.generic.DomainEvent;

import java.time.Year;

public class LibroCreado extends DomainEvent {
    private final Titulo titulo;
    private final Year year;
    public LibroCreado(Titulo titulo, Year year) {
        super("sofka.libro.librocreado");
        this.titulo=titulo;
        this.year=year;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public Year getYear() {
        return year;
    }
}
