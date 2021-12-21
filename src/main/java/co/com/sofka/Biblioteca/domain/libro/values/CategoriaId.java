package co.com.sofka.Biblioteca.domain.libro.values;

import co.com.sofka.domain.generic.Identity;

public class CategoriaId extends Identity {
    public CategoriaId() {
    }
    public CategoriaId(String id) {
        super(id);
    }
    public static CategoriaId of(String id){
        return new CategoriaId(id);
    }
}
