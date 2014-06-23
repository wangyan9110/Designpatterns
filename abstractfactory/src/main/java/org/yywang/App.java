package org.yywang;

import org.yywang.dp.Factory.DaoFactory;
import org.yywang.dp.Factory.impl.MysqlDaoFactoryImpl;
import org.yywang.dp.Factory.impl.SqlserverDaoFactoryImpl;
import org.yywang.dp.user.UserDao;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){

        DaoFactory daoFactory=new MysqlDaoFactoryImpl();
        UserDao userDao=daoFactory.create();
        userDao.insert(null);

        DaoFactory daoFactory1=new SqlserverDaoFactoryImpl();
        UserDao userDao1=daoFactory1.create();
        userDao1.delete("");
    }
}
