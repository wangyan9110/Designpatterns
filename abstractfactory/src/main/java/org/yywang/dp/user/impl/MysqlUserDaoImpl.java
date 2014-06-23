package org.yywang.dp.user.impl;

import org.yywang.dp.user.User;
import org.yywang.dp.user.UserDao;


public class MysqlUserDaoImpl implements UserDao {

    @Override
    public void insert(User user) {
        System.out.println("mysql insert user");
    }

    @Override
    public void delete(String id) {
        System.out.println("mysql delete user");
    }

    @Override
    public User find(String id) {
        System.out.println("mysql find user");
        return null;
    }
}
