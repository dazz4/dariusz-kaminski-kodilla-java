package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jacek = new Millenials("Jacek");
        User maciek = new ZGeneration("Maciek");
        User adam = new YGeneration("Adam");
        //When
        String jacekSocialPublisher = jacek.sharePost();
        String maciekSocialPublisher = maciek.sharePost();
        String adamSocialPublisher = adam.sharePost();
        //Then
        System.out.println(jacekSocialPublisher);
        System.out.println(maciekSocialPublisher);
        System.out.println(adamSocialPublisher);
        Assert.assertEquals("Facebook", jacekSocialPublisher);
        Assert.assertEquals("Snapchat", maciekSocialPublisher);
        Assert.assertEquals("Twitter", adamSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User jacek = new Millenials("Jacek");
        //When
        System.out.println("Jacek's old publisher: " + jacek.sharePost());
        jacek.setSocialPublisher(new TwitterPublisher());
        System.out.println("Jacek's new publisher: " + jacek.sharePost());
        String jacekSocialPublisher = jacek.sharePost();
        //Then
        Assert.assertEquals("Twitter", jacekSocialPublisher);
    }
}
