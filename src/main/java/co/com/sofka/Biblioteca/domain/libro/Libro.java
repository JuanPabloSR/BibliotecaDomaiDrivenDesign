package co.com.sofka.Biblioteca.domain.libro;

import co.com.sofka.Biblioteca.domain.libro.events.AutorAgregado;
import co.com.sofka.Biblioteca.domain.libro.events.CategoriaAgregada;
import co.com.sofka.Biblioteca.domain.libro.events.LibroCreado;
import co.com.sofka.Biblioteca.domain.libro.values.*;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.Biblioteca.domain.libro.values.Year;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Libro extends AggregateEvent<LibroId> {
    protected Set<Autor> autores;
    protected Set<Categoria> categorias;
    protected Titulo titulo;
    protected Year year;

    public Libro(LibroId entityId, Titulo titulo, Year year) {
        super(entityId);
        appendChange(new LibroCreado(titulo, year)).apply();
    }
    private Libro(LibroId entityId) {
        super(entityId);
        subscribe(new CambiarLibro(this));
    }
    public static Libro from(LibroId entityId, List<DomainEvent> events) {
        var libro = new Libro(entityId);
        events.forEach(libro::applyEvent);
        return libro;
    }
    public void agregarAutor(AutorId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AutorAgregado(entityId, nombre)).apply();
    }
    public void agregarCategoria(CategoriaId entityId, CategoriaPrincipal categoriaPrincipal) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(categoriaPrincipal);
        appendChange(new CategoriaAgregada(entityId, categoriaPrincipal)).apply();
    }

    public Optional<Autor> getAutorPorId(AutorId entityId){
        return autores()
                .stream()
                .filter(autor->autor.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Categoria> getTemaPorId(CategoriaId entityId){
        return categorias()
                .stream()
                .filter(tema->tema.identity().equals(entityId))
                .findFirst();
    }

    public Set<Autor> autores() {

        return autores;
    }
    public Set<Categoria> categorias() {

        return categorias;
    }

    public Titulo titulo() {

        return titulo;
    }

    public Year year() {
        return year;
    }
}
