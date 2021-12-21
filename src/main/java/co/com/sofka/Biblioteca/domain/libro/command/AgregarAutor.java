package co.com.sofka.Biblioteca.domain.libro.command;

import co.com.sofka.Biblioteca.domain.libro.values.AutorId;
import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarAutor  extends Command {
    private final LibroId libroId;
    private final AutorId entityId;
    private final Nombre nombre;

    public AgregarAutor(LibroId libroId, AutorId entityId, Nombre nombre) {
        this.libroId = libroId;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public AutorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}