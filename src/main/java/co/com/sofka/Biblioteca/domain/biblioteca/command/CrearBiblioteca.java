package co.com.sofka.Biblioteca.domain.biblioteca.command;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.domain.generic.Command;

public class CrearBiblioteca extends Command {
    private final BibliotecaId entityId;

    public CrearBiblioteca(BibliotecaId entityId) {
        this.entityId = entityId;
    }

    public BibliotecaId getEntityId() {
        return entityId;
    }

}