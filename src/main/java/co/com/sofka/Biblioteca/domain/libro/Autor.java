package co.com.sofka.Biblioteca.domain.libro;

import co.com.sofka.Biblioteca.domain.valuesGenerics.AutorId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Autor extends Entity<AutorId> {
    private Nombre nombre;

    public Autor(AutorId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }


    public Nombre nombre() {
        return nombre;
    }
    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
