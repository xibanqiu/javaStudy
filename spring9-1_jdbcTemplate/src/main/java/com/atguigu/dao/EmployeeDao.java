package com.atguigu.dao;

import com.atguigu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class EmployeeDao extends JdbcDaoSupport {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void initJdbcTemplate(DataSource dataSource){
        setDataSource(dataSource);
    }

    public int saveEmployee(Employee employee){

        return getJdbcTemplate().update("insert into employee(`name`,`salary`) values(?,?)", employee.getName(),
                employee.getSalary());
    }


}
