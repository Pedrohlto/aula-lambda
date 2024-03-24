package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        List<Integer> lista = HelpExemplo.listaInteiro(50);

        List<Integer> listaNumerosImpares = filtrar(lista, new Filtro<Integer>() {
            @Override
            public boolean filtrar(Integer valor) {
                return (valor % 2 != 0);
            }
        });

    }

    private static List<Integer> filtrar(List<Integer> lista, Filtro<Integer> filtro ){
        List<Integer> retorno = new ArrayList<>();
        for (Integer valor : lista){
            if(filtro.filtrar(valor)){
                retorno.add(valor);
            }
        }
        return retorno;
    }

    
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
