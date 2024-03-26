package org.example;

public class FiltroInteiros implements Filtro<Integer>{
    @Override
    public boolean filtrar(Integer obj) {
        return (obj % 2 != 0);
    }
}
