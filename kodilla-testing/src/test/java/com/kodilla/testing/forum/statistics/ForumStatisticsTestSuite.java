package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statistics = mock(Statistics.class);

        int totalPosts = 1000;
        int totalComments = 100;

        List<String> usersNamesList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            usersNamesList.add("user");
        }

        when(statistics.usersNames()).thenReturn(usersNamesList);
        when(statistics.postsCount()).thenReturn(totalPosts);
        when(statistics.commentsCount()).thenReturn(totalComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statistics);

        //When
        int averagePostsPerUser = forumStatistics.getPostsPerUser();
        int averageCommentsPerUser = forumStatistics.getCommentsPerUser();
        int averageCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(200, averagePostsPerUser );
        Assert.assertEquals(20, averageCommentsPerUser );
        Assert.assertEquals(10, averageCommentsPerPost );
    }

    @Test
    public void testCalculateAdvStatisticsIfZero() {
        //Given
        Statistics statistics = mock(Statistics.class);

        int totalPosts = 0;
        int totalComments = 0;
        List<String> usersNamesList = new ArrayList<>();

        when(statistics.usersNames()).thenReturn(usersNamesList);
        when(statistics.postsCount()).thenReturn(totalPosts);
        when(statistics.commentsCount()).thenReturn(totalComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statistics);

        //When
        int averagePostsPerUser = forumStatistics.getPostsPerUser();
        int averageCommentsPerUser = forumStatistics.getCommentsPerUser();
        int averageCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostsPerUser );
        Assert.assertEquals(0, averageCommentsPerUser );
        Assert.assertEquals(0, averageCommentsPerPost );
    }

}
