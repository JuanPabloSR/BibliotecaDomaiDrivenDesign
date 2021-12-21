package co.com.sofka.Biblioteca.domain.biblioteca.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HoraInicio implements ValueObject<String> {
    private final String value;

    public HoraInicio(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La hora de inicio no puede estar vacia");
        }
    }


    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraInicio that = (HoraInicio) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}