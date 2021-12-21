package co.com.sofka.Biblioteca.domain.prestamo.command;

import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.Biblioteca.domain.prestamo.values.PrestamoId;
import co.com.sofka.domain.generic.Command;

public class AgregarLibro extends Command {
    private final PrestamoId prestamoId;
    private final LibroId libroId;

    public AgregarLibro(PrestamoId prestamoId, LibroId libroId) {
        this.prestamoId = prestamoId;
        this.libroId = libroId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public LibroId getLibroId() {
        return libroId;
    }
}