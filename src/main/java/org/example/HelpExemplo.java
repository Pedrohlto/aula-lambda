package org.example;

import java.time.LocalDateTime;
import java.util.*;

public class HelpExemplo {

    public static List<Integer> listaInteiro(int quantidade) {
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i <= quantidade; i++) {
            valores.add(i);
        }
        return valores;
    }

    public static List<Endereco> listaDeEnderecos(int quantidadeEndereco){

        List<Endereco> enderecosRetorno = new ArrayList<>();
        String[] enderecos = {"SP", "RJ", "MG"};
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random random = new Random();
        for (int i = 0 ; i < quantidadeEndereco; i++){
            enderecosRetorno.add(new Endereco(String.format("rua %s", letras.charAt(random.nextInt(letras.length()))),
                    enderecos[random.nextInt(enderecos.length -1)]));
        }
        return enderecosRetorno;

    }

    public static List<Tweets> listaDeTweets(int quantidadeTweets){
        List<Tweets> tweets = new ArrayList<>();

        String[] hashtags = {"#moda", "#esporte", "#politica", "#tecnologia", "#famosos"};
        String[] users = {"@user1", "@user2", "@user3", "@user4", "@user5"};
        String[] palavras = { "Lorem", "ipsum",  "dolor",  "sit", "amet" , "consectetur", "adipiscing", "elit.", "Nullam", "nec", "purus"};

        Random random = new Random();
        for (int i = 0 ; i < quantidadeTweets; i++){
            String mensagem = palavras[random.nextInt(palavras.length)] + " " + palavras[random.nextInt(palavras.length)] + " " + palavras[random.nextInt(palavras.length)] + " " + hashtags[random.nextInt(hashtags.length)];
            tweets.add(new Tweets(users[random.nextInt(users.length)], mensagem, LocalDateTime.now().minusDays(random.nextInt(10)).minusHours(random.nextInt(24))));
        }
        return tweets;
    }


}
