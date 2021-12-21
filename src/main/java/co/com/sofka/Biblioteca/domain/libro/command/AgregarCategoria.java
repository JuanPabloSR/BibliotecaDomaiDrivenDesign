package co.com.sofka.Biblioteca.domain.libro.command;

import co.com.sofka.Biblioteca.domain.libro.values.CategoriaId;
import co.com.sofka.Biblioteca.domain.libro.values.CategoriaPrincipal;
import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.domain.generic.Command;

public class AgregarCategoria extends Command {
    private final LibroId libroId;
    private final CategoriaId entityId;
    private final CategoriaPrincipal categoriaPrincipal;

    public AgregarCategoria(LibroId libroId, CategoriaId entityId, CategoriaPrincipal categoriaPrincipal) {
        this.libroId = libroId;
        this.entityId = entityId;
        this.categoriaPrincipal = categoriaPrincipal;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public CategoriaId getEntityId() {
        return entityId;
    }
    public CategoriaPrincipal getCategoriaPrincipal() {
        return categoriaPrincipal;
    }
}