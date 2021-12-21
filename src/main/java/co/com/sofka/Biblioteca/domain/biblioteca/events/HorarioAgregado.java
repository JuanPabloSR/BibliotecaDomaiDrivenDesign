package co.com.sofka.Biblioteca.domain.biblioteca.events;

import co.com.sofka.Biblioteca.domain.biblioteca.Horario;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HoraFin;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HoraInicio;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioAgregado extends DomainEvent {
    private final HorarioId horarioId;
    private final HoraInicio horaInicio;
    private final HoraFin horaFin;
    public HorarioAgregado(HorarioId entityId, HoraInicio horaInicio, HoraFin horaFin) {
        super("sofka.bibliotecario.horarioagregado");
        this.horarioId = entityId;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public HorarioId getHorarioId() {
        return horarioId;
    }

    public HoraInicio getHoraInicio() {
        return horaInicio;
    }

    public HoraFin getHoraFin() {
        return horaFin;
    }
}
