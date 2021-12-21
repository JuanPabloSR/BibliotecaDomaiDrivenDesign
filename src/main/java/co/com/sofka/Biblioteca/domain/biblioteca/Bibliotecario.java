package co.com.sofka.Biblioteca.domain.biblioteca;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecarioId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Bibliotecario extends Entity<BibliotecarioId> {
    private  Nombre nombre;
    public Bibliotecario(BibliotecarioId entityId, Nombre nombre) {
        super(entityId);
        this.nombre=nombre;
    }

    public Nombre nombre() {
        return nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}