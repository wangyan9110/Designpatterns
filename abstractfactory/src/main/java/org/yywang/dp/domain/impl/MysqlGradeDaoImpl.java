package org.yywang.dp.domain.impl;

import org.yywang.dp.domain.GradeDao;

public class MysqlGradeDaoImpl implements GradeDao{

    @Override
    public void find(String id) {
        System.out.println("mysql find grade");
    }
}
