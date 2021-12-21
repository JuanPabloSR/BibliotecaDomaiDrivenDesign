package co.com.sofka.Biblioteca.domain.prestamo;

import co.com.sofka.Biblioteca.domain.prestamo.events.BibliotecaAgregada;
import co.com.sofka.Biblioteca.domain.prestamo.events.LibroAgregado;
import co.com.sofka.Biblioteca.domain.prestamo.events.PrestamoCreado;
import co.com.sofka.Biblioteca.domain.prestamo.values.ClienteId;
import co.com.sofka.domain.generic.EventChange;

public class PrestamoCambio extends EventChange {
    public PrestamoCambio(Prestamo prestamo) {
        apply((PrestamoCreado event)->{
            prestamo.diasPrestado=event.getDiasPrestado();
            prestamo.fecha=event.getFecha();
            prestamo.cliente=new Cliente(new ClienteId(),event.getNombre());
            prestamo.libroId=event.getLibroId();
            prestamo.bibliotecaId=event.getBibliotecaId();

        });
        apply((LibroAgregado event)-> {
            prestamo.libroId = event.getLibroId();
        });
        apply((BibliotecaAgregada event)-> {
            prestamo.bibliotecaId = event.getBibliotecaId();
        });


    }
}