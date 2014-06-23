package org.yywang.dp.user.impl;

import org.yywang.dp.user.User;
import org.yywang.dp.user.UserDao;

/**
 *
 */
public class SqlServerUserDaoImpl implements UserDao {

    @Override
    public void insert(User user) {
        System.out.println("sqlserver insert user");
    }

    @Override
    public void delete(String id) {
        System.out.println("sqlserver delete user");
    }

    @Override
    public User find(String id) {
        System.out.println("sqlserver find user");
        return null;
    }
}
