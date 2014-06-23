package org.yywang.dp.Factory.impl;

import org.yywang.dp.Factory.DaoFactory;
import org.yywang.dp.user.UserDao;
import org.yywang.dp.user.impl.SqlServerUserDaoImpl;

public class SqlserverDaoFactoryImpl implements DaoFactory {

    @Override
    public UserDao create() {
        return new SqlServerUserDaoImpl();
    }
}
