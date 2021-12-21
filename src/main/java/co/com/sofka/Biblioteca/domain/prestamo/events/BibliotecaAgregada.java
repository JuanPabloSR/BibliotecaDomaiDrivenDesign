package co.com.sofka.Biblioteca.domain.prestamo.events;

import co.com.sofka.Biblioteca.domain.biblioteca.Biblioteca;
import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.domain.generic.DomainEvent;

public class BibliotecaAgregada extends DomainEvent {
    private final BibliotecaId bibliotecaId;
    public BibliotecaAgregada(BibliotecaId bibliotecaId) {
        super("sofka.prestamo.bibliotecaagregada");
        this.bibliotecaId = bibliotecaId;
    }
    public BibliotecaId getBibliotecaId() {
        return bibliotecaId;
    }
}
