package org.example;

import java.time.LocalDateTime;

public final class Tweets {

    private final String user;
    private final String message;
    private final LocalDateTime data;

    public Tweets(String user, String message, LocalDateTime data){
        this.user = user;
        this.message = message;
        this.data = data;
    }

    public String getUser() {
        return user;
    }
    public String getMessage() {
        return message;
    }

    public LocalDateTime getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweets tweets = (Tweets) o;
        return user.equals(tweets.user) && message.equals(tweets.message);
    }

    @Override
    public int hashCode() {
        return user.hashCode() + message.hashCode();
    }

}
