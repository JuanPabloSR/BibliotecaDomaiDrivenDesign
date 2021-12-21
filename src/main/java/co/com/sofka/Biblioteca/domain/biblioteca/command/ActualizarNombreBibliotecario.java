package co.com.sofka.Biblioteca.domain.biblioteca.command;

import co.com.sofka.Biblioteca.domain.biblioteca.values.BibliotecaId;
import co.com.sofka.Biblioteca.domain.valuesGenerics.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreBibliotecario extends Command {
    private final BibliotecaId bibliotecaId;
    private final Nombre nombre;

    public ActualizarNombreBibliotecario(BibliotecaId bibliotecaId,Nombre nombre) {
        this.bibliotecaId = bibliotecaId;
        this.nombre = nombre;
    }

    public BibliotecaId getBibliotecaId() {
        return bibliotecaId;
    }


    public Nombre getNombre() {
        return nombre;
    }
}