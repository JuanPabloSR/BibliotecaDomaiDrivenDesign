package co.com.sofka.Biblioteca.domain.biblioteca.events;

import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeBibliotecarioActualizado extends DomainEvent {
    private final Nombre nombre;
    public NombreDeBibliotecarioActualizado(Nombre nombre) {
        super("sofka.biblioteca.nombredebibliotecarioactualizado");
        this.nombre=nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}