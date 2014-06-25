package org.yywang;

import org.yywang.dp.domain.GradeDao;
import org.yywang.dp.factory.DaoFactory;
import org.yywang.dp.factory.impl.MysqlDaoFactoryImpl;
import org.yywang.dp.factory.impl.SqlserverDaoFactoryImpl;
import org.yywang.dp.domain.UserDao;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){

        DaoFactory daoFactory=new MysqlDaoFactoryImpl();
        UserDao userDao=daoFactory.createUserDao();
        userDao.insert(null);
        GradeDao gradeDao=daoFactory.createGradeDao();
        gradeDao.find("");

        DaoFactory daoFactory1=new SqlserverDaoFactoryImpl();
        UserDao userDao1=daoFactory1.createUserDao();
        userDao1.delete("");
        GradeDao gradeDao1=daoFactory1.createGradeDao();
        gradeDao1.find("");
    }
}
