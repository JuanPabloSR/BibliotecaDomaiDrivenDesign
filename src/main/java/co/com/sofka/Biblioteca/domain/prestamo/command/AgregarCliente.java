package co.com.sofka.Biblioteca.domain.prestamo.command;

import co.com.sofka.Biblioteca.domain.prestamo.values.ClienteId;
import co.com.sofka.Biblioteca.domain.prestamo.values.PrestamoId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarCliente extends Command {
    private final PrestamoId prestamoId;
    private final ClienteId entityId;
    private final Nombre nombre;

    public AgregarCliente(PrestamoId prestamoId, ClienteId entityId, Nombre nombre) {
        this.prestamoId = prestamoId;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

}