package org.yywang.dp.factory.impl;

import org.yywang.dp.domain.GradeDao;
import org.yywang.dp.domain.impl.MysqlGradeDaoImpl;
import org.yywang.dp.factory.DaoFactory;
import org.yywang.dp.domain.UserDao;
import org.yywang.dp.domain.impl.MysqlUserDaoImpl;

public class MysqlDaoFactoryImpl implements DaoFactory {

    @Override
    public UserDao createUserDao() {
        return new MysqlUserDaoImpl();
    }

    @Override
    public GradeDao createGradeDao() {
        return new MysqlGradeDaoImpl();
    }
}
