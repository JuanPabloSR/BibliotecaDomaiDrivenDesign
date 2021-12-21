package co.com.sofka.Biblioteca.domain.prestamo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DiasPrestado implements ValueObject<Integer> {
    private final Integer value;

    public DiasPrestado(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiasPrestado that = (DiasPrestado) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
