package com.kodilla.good.patterns.challenges.chelangeTwo;

public class User {

    private String name;
    private  String nickName;
    private String mail;

    public User(String name, String nickName, String mail) {
        this.name = name;
        this.nickName = nickName;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getMail() {
        return mail;
    }
}
