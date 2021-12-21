package co.com.sofka.Biblioteca.domain.biblioteca;

import co.com.sofka.Biblioteca.domain.biblioteca.values.HoraFin;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HoraInicio;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HorarioId;
import co.com.sofka.domain.generic.Entity;

public class Horario extends Entity<HorarioId> {
    private final HoraInicio horaInicio;
    private final HoraFin horaFin;
    public Horario(HorarioId entityId, HoraInicio horaInicio, HoraFin horaFin) {
        super(entityId);
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;

    }

    public HoraInicio horarioInicio() {
        return horaInicio;
    }

    public HoraFin horarioFin() {
        return horaFin;
    }
}