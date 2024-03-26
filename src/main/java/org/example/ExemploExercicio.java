package org.example;

public class ExemploExercicio {

    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 10;

        Operacao soma = (valorA, ValorB ) ->{return valorA + ValorB;};
        Operacao subtracao = (valorA, ValorB ) ->{return valorA - ValorB;};
        Operacao multi = (valorA, ValorB ) ->{return valorA * ValorB;};
        Operacao divi = (valorA, ValorB ) ->{return valorA / ValorB;};

        System.out.println(soma.calcular(a, b));
        System.out.println(subtracao.calcular(a, b));
        System.out.println(multi.calcular(a, b));
        System.out.println(divi.calcular(a, b));

    }
}
