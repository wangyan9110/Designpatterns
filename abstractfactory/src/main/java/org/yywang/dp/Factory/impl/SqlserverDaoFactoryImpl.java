package org.yywang.dp.factory.impl;

import org.yywang.dp.domain.GradeDao;
import org.yywang.dp.domain.impl.SqlServerGradeDaoImpl;
import org.yywang.dp.factory.DaoFactory;
import org.yywang.dp.domain.UserDao;
import org.yywang.dp.domain.impl.SqlServerUserDaoImpl;

public class SqlserverDaoFactoryImpl implements DaoFactory {

    @Override
    public UserDao createUserDao() {
        return new SqlServerUserDaoImpl();
    }

    @Override
    public GradeDao createGradeDao() {
        return new SqlServerGradeDaoImpl();
    }
}
