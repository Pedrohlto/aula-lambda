package org.example;

import java.util.List;

public class AppTw {

    public static void main(String[] args) {
        List<Tweets> tweets = HelpExemplo.listaDeTweets(150);

//        tweets.forEach(tweets1 -> System.out.println(tweets1.getMessage()));

        tweets.removeIf(tweets1 -> !tweets1.getMessage().contains("#moda"));

        tweets.sort((valor1, valor2 ) -> {
            System.out.println("teste");
            return valor1.getData().compareTo(valor2.getData());

        });
        tweets.forEach(tweets1 -> {
            System.out.println(tweets1.getUser());
            System.out.println(tweets1.getMessage());
            System.out.println(tweets1.getData());
            System.out.println("*****************************");
        });



    }


}
