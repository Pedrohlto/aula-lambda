package org.example;

import java.util.Objects;

public final class Endereco {

    private final String rua;
    private final String cidade;

    public Endereco(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }
    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(rua, endereco.rua) && Objects.equals(cidade, endereco.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, cidade);
    }
}
