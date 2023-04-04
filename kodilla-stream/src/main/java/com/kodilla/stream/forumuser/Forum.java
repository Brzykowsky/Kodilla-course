package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser("001", LocalDate.of(1980, 2,23),"User1",
                'M', 13));
        forumUserList.add(new ForumUser("002", LocalDate.of(1981, 3,21),"User2",
                'W',1));
        forumUserList.add(new ForumUser("003", LocalDate.of(2007, 5,12),"User3",
                'M', 2 ));
        forumUserList.add(new ForumUser("004", LocalDate.of(1983, 8,2),"User4",
                'W', 0));
        forumUserList.add(new ForumUser("005", LocalDate.of(2003, 4,28),"User5",
                'M', 12));
        forumUserList.add(new ForumUser("006", LocalDate.of(1998, 9,2),"User6",
                'M', 3));
        forumUserList.add(new ForumUser("007", LocalDate.of(1999, 10,28),"User7",
                'W', 0));
        forumUserList.add(new ForumUser("008", LocalDate.of(2008, 11,13),"User8",
                'M', 0));
        forumUserList.add(new ForumUser("009", LocalDate.of(2009, 12,28),"User9",
                'W', 1));
        forumUserList.add(new ForumUser("010", LocalDate.of(2001, 1,1),"User10",
                'W', 4));
        forumUserList.add(new ForumUser("011", LocalDate.of(1998, 2,2),"User11",
                'W',1));
    }

    public List<ForumUser> getListOfUsers(){
        return forumUserList;
    }
}
