package com.kodilla.patterns.strategy.social;

public final class YGeneration extends User{

    private String name;

    public YGeneration(String userName, String mail, String name) {
        super(userName, mail);
        this.socialPublisher = new FacebookPublisher();
    }
}
