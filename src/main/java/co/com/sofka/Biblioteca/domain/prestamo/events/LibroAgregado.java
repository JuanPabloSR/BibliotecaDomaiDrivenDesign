package co.com.sofka.Biblioteca.domain.prestamo.events;

import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.domain.generic.DomainEvent;

public class LibroAgregado extends DomainEvent {
    private final LibroId libroId;
    public LibroAgregado(LibroId libroId) {
        super("sofka.prestamo.libroagregado");
        this.libroId=libroId;
    }

    public LibroId getLibroId() {
        return libroId;
    }
}