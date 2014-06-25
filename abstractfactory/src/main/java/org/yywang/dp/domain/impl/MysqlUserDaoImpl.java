package org.yywang.dp.domain.impl;

import org.yywang.dp.domain.User;
import org.yywang.dp.domain.UserDao;


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
