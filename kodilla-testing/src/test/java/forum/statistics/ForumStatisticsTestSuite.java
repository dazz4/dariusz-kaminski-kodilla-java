package forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
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
        usersNamesList.add("User1");
        usersNamesList.add("User2");
        usersNamesList.add("User3");
        usersNamesList.add("User4");
        usersNamesList.add("User5");

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

}
