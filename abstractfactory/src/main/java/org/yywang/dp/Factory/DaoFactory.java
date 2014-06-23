package org.yywang.dp.Factory;


import org.yywang.dp.user.UserDao;

public interface DaoFactory {

    UserDao create();
}
