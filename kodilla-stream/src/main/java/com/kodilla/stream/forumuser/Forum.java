package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "IronMan", 'M', 1984, 2, 20, 55));
        forumUsers.add(new ForumUser(2, "Thor", 'M', 1966, 1, 12, 87));
        forumUsers.add(new ForumUser(3, "Ant-Man", 'M', 1959, 5, 22, 234));
        forumUsers.add(new ForumUser(4, "Wasp", 'F', 1977, 10, 25, 6));
        forumUsers.add(new ForumUser(5, "Hulk", 'M', 1700, 1, 1, 0));
    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    }
}
