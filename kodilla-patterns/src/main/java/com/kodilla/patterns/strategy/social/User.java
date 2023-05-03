package com.kodilla.patterns.strategy.social;

public sealed class User
        permits Millenials, YGeneration, ZGeneration{

    private String userName;
    private String mail;
    protected SocialPublisher socialPublisher;

    public User(String userName, String mail){
        this.mail = mail;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getMail() {
        return mail;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
