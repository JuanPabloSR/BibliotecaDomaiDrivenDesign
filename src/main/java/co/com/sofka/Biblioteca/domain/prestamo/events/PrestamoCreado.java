package co.com.sofka.Biblioteca.domain.prestamo.events;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.Biblioteca.domain.prestamo.values.DiasPrestado;
import co.com.sofka.Biblioteca.domain.prestamo.values.Fecha;
import co.com.sofka.Biblioteca.domain.prestamo.values.PrestamoId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class PrestamoCreado extends DomainEvent {
    private final PrestamoId prestamoId;
    private final BibliotecaId bibliotecaId;
    private final LibroId libroId;
    private final Fecha fecha;
    private final DiasPrestado diasPrestado;
    private final Nombre nombre;

    public PrestamoCreado(PrestamoId entityId, BibliotecaId bibliotecaId, LibroId libroId, Fecha fecha, DiasPrestado diasPrestado, Nombre nombre) {
        super("sofka.prestamo.lectorcreado");
        this.prestamoId = entityId;
        this.bibliotecaId = bibliotecaId;
        this.libroId = libroId;
        this.fecha = fecha;
        this.diasPrestado = diasPrestado;
        this.nombre = nombre;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
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