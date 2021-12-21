package co.com.sofka.Biblioteca.domain.libro.events;

import co.com.sofka.Biblioteca.domain.libro.Autor;
import co.com.sofka.Biblioteca.domain.libro.values.AutorId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AutorAgregado extends DomainEvent {
    private final AutorId autorId;
    private final Nombre nombre;
    public AutorAgregado(AutorId entityId, Nombre nombre) {
        super("sofka.libro.autoragregado");
        this.autorId=entityId;
        this.nombre=nombre;
    }

    public AutorId getAutorId() {
        return autorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
