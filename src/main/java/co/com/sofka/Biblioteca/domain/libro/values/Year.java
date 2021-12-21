package co.com.sofka.Biblioteca.domain.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Year implements ValueObject<String> {
    private final String value;

    public Year(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El año no puede estar vacio");
        }
    }


    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Year year = (Year) o;
        return Objects.equals(value, year.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}