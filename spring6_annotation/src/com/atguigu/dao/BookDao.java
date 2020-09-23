package com.atguigu.dao;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @Repository 注解表示
 *      <bean id ="bookDao" class=" com.atguigu.dao.BookDao"></>
 *
 * @ Scope 为 作用域
 *          prototype ---> 为多例
 */
@Repository
@Scope("prototype")
public class BookDao {


}
