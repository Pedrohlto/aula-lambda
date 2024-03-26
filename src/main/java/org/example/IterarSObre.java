package org.example;

import java.util.function.Consumer;

public class IterarSObre implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("Imprimindo valor " + integer);
    }
}
