package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    final private String id;
    final private LocalDate localDate;
    final private String userName;
    final private Character sex;
    final private int amountOfPublishedPosts;

    public ForumUser(final String id,final LocalDate localDate,final String userName
            ,final Character sex,final int amountOfPublishedPosts) {
        this.id = id;
        this.localDate = localDate;
        this.userName = userName;
        this.sex = sex;
        this.amountOfPublishedPosts = amountOfPublishedPosts;
    }

    public String getId() {
        return id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getAmountOfPublishedPosts() {
        return amountOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id='" + id + '\'' +
                ", localDate=" + localDate +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", amountOfPublishedPosts=" + amountOfPublishedPosts +
                '}';
    }
}
