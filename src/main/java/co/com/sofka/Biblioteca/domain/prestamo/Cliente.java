package co.com.sofka.Biblioteca.domain.prestamo;

import co.com.sofka.Biblioteca.domain.prestamo.values.ClienteId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Edad;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<ClienteId> {
    private Nombre nombre;
    private Edad edad;

    public Cliente(ClienteId entityId, Nombre nombre, Edad edad) {
        super(entityId);
        this.nombre=nombre;
        this.edad=edad;
    }
    public Nombre nombre() {
        return nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Edad edad() {
        return edad;
    }

    public void actualizarEdad(Edad edad) {
        this.edad =edad;
    }
}
