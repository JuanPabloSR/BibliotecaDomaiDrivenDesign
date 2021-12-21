package co.com.sofka.Biblioteca.domain.libro.events;

import co.com.sofka.Biblioteca.domain.libro.values.CategoriaId;
import co.com.sofka.Biblioteca.domain.libro.values.CategoriaPrincipal;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaAgregada extends DomainEvent {
    private CategoriaId categoriaId;
    private CategoriaPrincipal categoriaPrincipal;
    public CategoriaAgregada(CategoriaId entityId, CategoriaPrincipal categoriaPrincipal) {
        super("sofka.libro.categoriaagregada");
        this.categoriaId = entityId;
        this.categoriaPrincipal = categoriaPrincipal;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public CategoriaPrincipal getCategoriaPrincipal() {
        return categoriaPrincipal;
    }
}
