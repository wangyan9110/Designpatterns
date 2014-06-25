package org.yywang.dp.domain.impl;

import org.yywang.dp.domain.GradeDao;

/**
 * Created by wangyan on 14-6-25.
 */
public class SqlServerGradeDaoImpl implements GradeDao {
    @Override
    public void find(String id) {
        System.out.println("sqlserver find grade");
    }
}
