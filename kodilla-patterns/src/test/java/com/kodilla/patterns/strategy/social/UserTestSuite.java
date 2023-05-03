package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("user1", "user1@ok.pl","userName1");
        User user2 = new YGeneration("user2", "user2@ok.pl","userName2");
        User user3 = new ZGeneration("user3", "user3@ok.pl","userName3");
        //When
        String user1PostedBy = user1.sharePost();
        System.out.println(user1PostedBy);
        String user2PostedBy = user2.sharePost();
        System.out.println(user2PostedBy);
        String user3PostedBy = user3.sharePost();
        System.out.println(user3PostedBy);
        //Then
        assertEquals("User just published post on Snapchat",user3PostedBy);
        assertEquals("User just published post on Facebook",user2PostedBy);
        assertEquals("User just published post on Twitter",user1PostedBy);


    }

    @Test
    public void testIndividualSharingStrategy(){

        //given
        User user = new Millenials("user", "user@ok.pl","userName");

        //when
        String userPostedBy = user.sharePost();
        System.out.println(userPostedBy);
        user.setPublisher(new FacebookPublisher());
        userPostedBy = user.sharePost();
        System.out.println(userPostedBy);
        //then

        assertEquals("User just published post on Facebook",userPostedBy);
    }
}
