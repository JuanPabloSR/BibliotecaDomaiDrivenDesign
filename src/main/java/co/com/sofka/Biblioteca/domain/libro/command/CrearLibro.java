package co.com.sofka.Biblioteca.domain.libro.command;

import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.Biblioteca.domain.libro.values.Titulo;
import co.com.sofka.Biblioteca.domain.libro.values.Year;
import co.com.sofka.domain.generic.Command;

public class CrearLibro extends Command {
    private final LibroId entityId;
    private final Titulo titulo;
    private final Year year;

    public CrearLibro(LibroId entityId, Titulo titulo, Year year) {
        this.entityId = entityId;
        this.titulo = titulo;
        this.year = year;
    }

    public LibroId getEntityId() {
        return entityId;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public Year getYear() {
        return year;
    }
}