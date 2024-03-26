package org.example;
@FunctionalInterface
public interface Filtro<T> {
    boolean filtrar(T obj);
}
