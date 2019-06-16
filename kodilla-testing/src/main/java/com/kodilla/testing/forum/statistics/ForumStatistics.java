package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int totalUsers;
    int totalPosts;
    int totalComments;

    int postsPerUser;
    int commentsPerUser;
    int commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        this.totalUsers = statistics.usersNames().size();
        this.totalPosts = statistics.postsCount();
        this.totalComments = statistics.commentsCount();

        commentsPerPost = totalPosts / totalComments;
        postsPerUser = totalPosts / totalUsers;
        commentsPerUser = totalComments / totalUsers;

    }

    public int getPostsPerUser() {
        return postsPerUser;
    }

    public int getCommentsPerUser() {
        return commentsPerUser;
    }

    public int getCommentsPerPost() {
        return commentsPerPost;
    }
}
