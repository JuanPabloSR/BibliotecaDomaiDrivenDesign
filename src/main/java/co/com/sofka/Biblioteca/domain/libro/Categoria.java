package co.com.sofka.Biblioteca.domain.libro;

import co.com.sofka.Biblioteca.domain.libro.values.CategoriaId;
import co.com.sofka.Biblioteca.domain.libro.values.CategoriaPrincipal;
import co.com.sofka.domain.generic.Entity;

public class Categoria extends Entity<CategoriaId> {
    private CategoriaPrincipal categoriaPrincipal;

    public Categoria(CategoriaId entityId, CategoriaPrincipal categoriaPrincipal) {
        super(entityId);
        this.categoriaPrincipal = categoriaPrincipal;
    }
    public CategoriaPrincipal categoriaPrincipal() {
        return CategoriaPrincipal;
    }
    public void actualizarCategoriaPrincipal(CategoriaPrincipal categoriaPrincipal) {
        this.categoriaPrincipal = categoriaPrincipal;
    }
}
