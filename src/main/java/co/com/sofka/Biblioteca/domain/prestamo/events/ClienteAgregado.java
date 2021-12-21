package co.com.sofka.Biblioteca.domain.prestamo.events;

import co.com.sofka.Biblioteca.domain.prestamo.values.ClienteId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    public ClienteAgregado(ClienteId entityId, Nombre nombre) {
        super("sofka.prestamo.clienteagregado");
        this.clienteId= entityId;
        this.nombre=nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
