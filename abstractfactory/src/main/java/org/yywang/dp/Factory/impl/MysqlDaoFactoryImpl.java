package org.yywang.dp.Factory.impl;

import org.yywang.dp.Factory.DaoFactory;
import org.yywang.dp.user.UserDao;
import org.yywang.dp.user.impl.MysqlUserDaoImpl;

public class MysqlDaoFactoryImpl implements DaoFactory {

    @Override
    public UserDao create() {
        return new MysqlUserDaoImpl();
    }
}
