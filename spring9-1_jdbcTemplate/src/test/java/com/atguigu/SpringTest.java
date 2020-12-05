package com.atguigu;


import com.atguigu.dao.EmployeeDao;
import com.atguigu.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringRunner.class)
public class SpringTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void test()throws Exception{
        System.out.println(dataSource.getConnection());

    }

    @Test
    public void test2(){
        String sql = "update employee set salary = ? where id = ?";
        jdbcTemplate.update(sql,new BigDecimal(1300),5);
    }


    @Test
    public void test3(){

        String sql = "insert into employee(`name`,`salary`) values(?,?)";

        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"tom",new BigDecimal(9999)});
        list.add(new Object[]{"jack",new BigDecimal(8888)});
        list.add(new Object[]{"jerry",new BigDecimal(7777)});
        jdbcTemplate.batchUpdate(sql,list);

    }

    @Test
    public void test4(){
        String sql = "select id,name,salary from employee where id = ?";

        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class), 5);
        System.out.println(employee);

    }


    @Test
    public void test5(){
        String sql = "select id,name,salary from employee where salary > ?";

       jdbcTemplate.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class),new BigDecimal(4000)).forEach( System.out::println );
    }

    @Test
    public void test6() throws Exception {
        String sql = "select max(salary) from employee";
        BigDecimal salary = jdbcTemplate.queryForObject(sql, BigDecimal.class);
        System.out.println( salary );
    }

    @Test
    public void test7(){
        String sql = "insert into employee(`name`,`salary`) values(:name,:salary)";

        Map<String,Object> mm = new HashMap<>();
        mm.put("name","我是命名(具名)参数的");
        mm.put("salary",new BigDecimal(1234));

        namedParameterJdbcTemplate.update(sql,mm);

    }

    @Test
    public void test8(){
        String sql = "insert into employee(`name`,`salary`) values(:name,:salary)";

        Map<String,Object> mm = new HashMap<>();
        mm.put("name","我是命名(具名)参数的");
        mm.put("salary",new BigDecimal(1234));

        namedParameterJdbcTemplate.update(sql,mm);

    }

    @Test
    public void test9(){
        Employee employee = new Employee(null, "我是Dao插入的", new BigDecimal(1234));
        employeeDao.saveEmployee(employee);


    }

    @Test
    public void test10() throws Exception {
        Employee employee = new Employee(null, "我是JdbcDaoSupport插入的", new BigDecimal(1234));
        employeeDao.saveEmployee(employee);
    }



}
