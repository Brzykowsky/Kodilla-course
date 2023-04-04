package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum forumOfUsers = new Forum();
        Map<String ,ForumUser> theResultListOfUsers = forumOfUsers.getListOfUsers().stream().filter(user -> user.getSex() == 'M')
                .filter(user -> user.getLocalDate().getYear() <= 2003)
                .filter(user -> user.getAmountOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId,user -> user));

        theResultListOfUsers.entrySet().stream().map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }
}