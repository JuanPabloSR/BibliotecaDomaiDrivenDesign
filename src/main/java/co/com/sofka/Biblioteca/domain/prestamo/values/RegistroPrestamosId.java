package co.com.sofka.Biblioteca.domain.prestamo.values;

import co.com.sofka.domain.generic.Identity;

public class RegistroPrestamosId extends Identity {
    public RegistroPrestamosId(){

    }
    public RegistroPrestamosId(String id){
        super(id);
    }
    public static RegistroPrestamosId of(String id){
        return new RegistroPrestamosId(id);
    }
}