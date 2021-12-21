package co.com.sofka.Biblioteca.domain.prestamo;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.Biblioteca.domain.libro.values.LibroId;
import co.com.sofka.Biblioteca.domain.prestamo.events.BibliotecaAgregada;
import co.com.sofka.Biblioteca.domain.prestamo.events.ClienteAgregado;
import co.com.sofka.Biblioteca.domain.prestamo.events.LibroAgregado;
import co.com.sofka.Biblioteca.domain.prestamo.events.PrestamoCreado;
import co.com.sofka.Biblioteca.domain.prestamo.values.ClienteId;
import co.com.sofka.Biblioteca.domain.prestamo.values.DiasPrestado;
import co.com.sofka.Biblioteca.domain.prestamo.values.Fecha;
import co.com.sofka.Biblioteca.domain.prestamo.values.PrestamoId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Prestamo extends AggregateEvent<PrestamoId> {
    protected Cliente cliente;
    protected BibliotecaId bibliotecaId;
    protected LibroId libroId;
    protected Fecha fecha;
    protected DiasPrestado diasPrestado;

    public Prestamo(PrestamoId entityId, BibliotecaId bibliotecaId, LibroId libroId, Fecha fecha, DiasPrestado diasPrestado, Nombre nombre) {
        super(entityId);
        appendChange(new PrestamoCreado(entityId, bibliotecaId, libroId, fecha, diasPrestado, nombre)).apply();
    }
    private Prestamo(PrestamoId entityId){
        super(entityId);
        subscribe(new PrestamoCambio(this));
    }
    public static Prestamo from(PrestamoId entityId, List<DomainEvent> events){
        var prestamo=new Prestamo(entityId);
        events.forEach(prestamo::applyEvent);
        return prestamo;
    }
    public void agregarCliente(ClienteId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new ClienteAgregado(entityId,nombre)).apply();
    }
    public void AgregarBiblioteca(BibliotecaId bibliotecaId){
        appendChange(new BibliotecaAgregada(bibliotecaId)).apply();
    }
    public void AgregarLibro(LibroId libroId){
        appendChange(new LibroAgregado(libroId)).apply();
    }

    public Cliente Cliente() {
        return cliente;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }

    public LibroId libroId() {
        return libroId;
    }

    public Fecha fecha() {
        return fecha;
    }

    public DiasPrestado diasDePrestamo() {
        return diasPrestado;
    }
}
