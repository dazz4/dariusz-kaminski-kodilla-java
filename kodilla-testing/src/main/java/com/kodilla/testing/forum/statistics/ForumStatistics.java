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

        if(totalPosts !=0 && totalComments != 0 && totalPosts > totalComments) {
            commentsPerPost = totalPosts / totalComments;
        } else {
            commentsPerPost = 0;
        }

        if (totalUsers != 0 && totalPosts != 0 && totalPosts > totalUsers) {
            postsPerUser = totalPosts / totalUsers;
        } else {
            postsPerUser = 0;
        }

        if (totalUsers != 0 && totalComments != 0 && totalComments > totalUsers) {
            commentsPerUser = totalComments / totalUsers;
        } else {
            commentsPerUser = 0;
        }

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
