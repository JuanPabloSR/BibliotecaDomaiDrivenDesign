package co.com.sofka.Biblioteca.domain.biblioteca.command;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HoraFin;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HoraInicio;
import co.com.sofka.Biblioteca.domain.biblioteca.values.HorarioId;
import co.com.sofka.domain.generic.Command;

public class AgregarHorario  extends Command {
    private final BibliotecaId bibliotecaId;
    private final HorarioId entityId;
    private final HoraInicio horaInicio;
    private final HoraFin horaFin;

    public AgregarHorario(BibliotecaId bibliotecaId,HorarioId entityId, HoraInicio horaInicio, HoraFin horaFin) {
        this.bibliotecaId=bibliotecaId;
        this.entityId = entityId;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public BibliotecaId getBibliotecaId() {
        return bibliotecaId;
    }

    public HorarioId getEntityId() {
        return entityId;
    }

    public HoraInicio getHoraInicio() {
        return horaInicio;
    }

    public HoraFin getHoraFin() {
        return horaFin;
    }
}