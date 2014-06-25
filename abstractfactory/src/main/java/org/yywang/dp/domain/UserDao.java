package org.yywang.dp.domain;

public interface UserDao {

    void insert(User user);

    void delete(String id);

    User find(String id);
}
