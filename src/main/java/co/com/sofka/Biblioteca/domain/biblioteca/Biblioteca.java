package co.com.sofka.Biblioteca.domain.biblioteca;

import co.com.sofka.Biblioteca.domain.biblioteca.events.BibliotecarioAgregado;
import co.com.sofka.Biblioteca.domain.biblioteca.events.HorarioAgregado;
import co.com.sofka.Biblioteca.domain.biblioteca.events.NombreDeBibliotecarioActualizado;
import co.com.sofka.Biblioteca.domain.biblioteca.values.*;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

import java.util.List;
import java.util.Objects;

public class Biblioteca extends AggregateEvent {
    protected Bibliotecario bibliotecario;
    protected Horario horario;

    public Biblioteca(Identity entityId) {
        super(entityId);
    }

    public static Biblioteca from(BibliotecaId bibliotecaId, List<DomainEvent> events) {
        var biblioteca = new Biblioteca(bibliotecaId);
        events.forEach(biblioteca::applyEvent);
        return biblioteca;
    }

    public void agregarBibliotecario(BibliotecarioId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new BibliotecarioAgregado(entityId, nombre)).apply();
    }

    public void agregarHorario(HorarioId entityId, HoraInicio horaInicio, HoraFin horaFin) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(horaInicio);
        Objects.requireNonNull(horaFin);
        appendChange(new HorarioAgregado(entityId, horaInicio, horaFin)).apply();
    }

    public void actualizarNombreDeBibliotecario(Nombre nombre) {
        appendChange(new NombreDeBibliotecarioActualizado(nombre)).apply();
    }

    public Bibliotecario bibliotecario() {
        return bibliotecario;
    }

    public Horario horario() {
        return horario;
    }

}
