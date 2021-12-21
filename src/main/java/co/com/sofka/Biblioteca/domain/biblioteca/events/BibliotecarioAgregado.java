package co.com.sofka.Biblioteca.domain.biblioteca.events;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecarioId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class BibliotecarioAgregado extends DomainEvent {
    private final BibliotecarioId bibliotecarioId;
    private final Nombre nombre;
    public BibliotecarioAgregado(BibliotecarioId entityId, Nombre nombre) {
        super("sofka.biblioteca.bibliotecarioagregado");
        this.bibliotecarioId=entityId;
        this.nombre=nombre;
    }

    public BibliotecarioId getBibliotecarioId() {
        return bibliotecarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}