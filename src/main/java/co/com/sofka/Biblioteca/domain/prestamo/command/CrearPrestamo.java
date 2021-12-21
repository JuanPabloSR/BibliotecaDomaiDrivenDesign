package co.com.sofka.Biblioteca.domain.prestamo.command;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.Biblioteca.domain.prestamo.values.DiasPrestado;
import co.com.sofka.Biblioteca.domain.prestamo.values.Fecha;
import co.com.sofka.Biblioteca.domain.prestamo.values.PrestamoId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearPrestamo extends Command {
    private final PrestamoId entityId;
    private final BibliotecaId bibliotecaId;
    private final LibroId libroId;
    private final Fecha fecha;
    private final DiasPrestado diasPrestado;
    private final Nombre nombre;

    public CrearPrestamo(PrestamoId entityId, BibliotecaId bibliotecaId, LibroId libroId, Fecha fecha, DiasPrestado diasPrestado, Nombre nombre) {
        this.entityId = entityId;
        this.bibliotecaId = bibliotecaId;
        this.libroId = libroId;
        this.fecha = fecha;
        this.diasPrestado = diasPrestado;
        this.nombre = nombre;
    }

    public PrestamoId getEntityId() {
        return entityId;
    }

    public BibliotecaId getBibliotecaId() {
        return bibliotecaId;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public DiasPrestado getDiasPrestado() {
        return diasPrestado;
    }

    public Nombre getNombre() {
        return nombre;
    }

}