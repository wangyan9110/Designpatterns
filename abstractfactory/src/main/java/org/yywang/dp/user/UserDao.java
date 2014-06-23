package org.yywang.dp.user;

public interface UserDao {

    void insert(User user);

    void delete(String id);

    User find(String id);
}
