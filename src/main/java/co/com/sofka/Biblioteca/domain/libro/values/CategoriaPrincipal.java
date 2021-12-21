package co.com.sofka.Biblioteca.domain.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CategoriaPrincipal implements ValueObject<String> {
    private final String value;
    public CategoriaPrincipal(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La categoria no puede estar vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaPrincipal that = (CategoriaPrincipal) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
