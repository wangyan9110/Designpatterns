package org.yywang.dp.domain.impl;

import org.yywang.dp.domain.User;
import org.yywang.dp.domain.UserDao;

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
