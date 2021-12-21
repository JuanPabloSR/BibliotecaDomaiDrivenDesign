package co.com.sofka.Biblioteca.domain.prestamo.command;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.Biblioteca.domain.prestamo.values.PrestamoId;
import co.com.sofka.domain.generic.Command;

public class AgregarBiblioteca extends Command {
    private final PrestamoId prestamoId;
    private final BibliotecaId bibliotecaId;

    public AgregarBiblioteca(PrestamoId prestamoId, BibliotecaId bibliotecaId) {
        this.prestamoId = prestamoId;
        this.bibliotecaId = bibliotecaId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public BibliotecaId getBibliotecaId() {
        return bibliotecaId;
    }
}