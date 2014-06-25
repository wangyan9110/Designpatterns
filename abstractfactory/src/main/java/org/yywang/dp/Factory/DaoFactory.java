package org.yywang.dp.factory;


import org.yywang.dp.domain.GradeDao;
import org.yywang.dp.domain.UserDao;

public interface DaoFactory {

    UserDao createUserDao();

    GradeDao createGradeDao();
}
