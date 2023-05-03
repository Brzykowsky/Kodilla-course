package com.kodilla.patterns.strategy.social;

public final class ZGeneration extends User{

    private String name;

    public ZGeneration(String userName, String mail, String name) {
        super(userName, mail);
        this.socialPublisher = new SnapchatPublisher();
    }
}
