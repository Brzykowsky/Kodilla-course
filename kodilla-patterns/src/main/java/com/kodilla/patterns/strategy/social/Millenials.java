package com.kodilla.patterns.strategy.social;

public final class Millenials extends User{

    private String name;

    public Millenials(String userName, String mail, String name) {
        super(userName, mail);
        this.socialPublisher = new TwitterPublisher();
    }
}
