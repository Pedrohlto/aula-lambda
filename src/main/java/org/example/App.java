package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        List<Integer> lista = HelpExemplo.listaInteiro(50);

        Predicate<String> retornaPares = (String variavelString) -> {
            if(variavelString.contains("#")){
                return true;
            } else{
                return false;
            }
        };

        System.out.println(retornaPares.test("qualquer string "));

        IterarSObre iterar = new IterarSObre();

        Consumer<Integer> consumer = (Integer valor) -> {
            System.out.println(valor);
            System.out.println(" ****** ");
        };


        Comparator<Integer> comparator =
                (Integer valor1, Integer valor2) -> valor2.compareTo(valor1);

        lista.sort(comparator);

        lista.forEach(System.out::println);


//        List<Integer> listaNumerosImpares =
//                filtrar(lista, (Integer valor) -> { return (valor % 2 != 0);});
//
//        System.out.println(listaNumerosImpares);

//
//        List<Integer> listaNumerosImpares = filtrar(lista, new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer valor) {
//                return (valor % 2 != 0);
//            }
//        });
//
//    }

//    private static List<Integer> filtrar(List<Integer> lista, Predicate<Integer> filtro ){
//        List<Integer> retorno = new ArrayList<>();
//        for (Integer valor : lista){
//            if(filtro.test(valor)){
//                retorno.add(valor);
//            }
//        }
//        return retorno;
//    }


//    private static void removerNumerosPares(List<Integer> lista){
//        Iterator<Integer> iterator = lista.iterator();
//        while(iterator.hasNext()){
//            Integer valor = iterator.next();
//            if(valor % 2 == 0){
//                iterator.remove();
//            }
//        }
//    }

//    private static List<Integer> removerNumerosPares(List<Integer> lista){
//        List<Integer> listaRetorno = new ArrayList<>();
//        for(Integer valor : lista){
//            if(valor % 2 != 0){
//                listaRetorno.add(valor);
//             }
//        }
//        return listaRetorno;
//    }
//
//    private static List<Integer> removerNumerosImpares(List<Integer> lista){
//        List<Integer> listaRetorno = new ArrayList<>();
//        for(Integer valor : lista){
//            if(valor % 2 == 0){
//                listaRetorno.add(valor);
//            }
//        }
//        return listaRetorno;
//    }
//
//    private static List<Integer> removerNumerosPrimos(List<Integer> lista){
//        List<Integer> listaRetorno = new ArrayList<>();
//        for(Integer valor : lista){
//            if(valor % 2 == 0){
//        }
//        return listaRetorno;
//    }
    }

}
