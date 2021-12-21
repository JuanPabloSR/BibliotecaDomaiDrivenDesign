package co.com.sofka.Biblioteca.domain.libro.values;

import co.com.sofka.domain.generic.Identity;

public class LibroId extends Identity {
    public LibroId() {
    }
    private LibroId(String id) {
        super(id);
    }
    public static LibroId of(String id) {
        return new LibroId(id);
    }
}
