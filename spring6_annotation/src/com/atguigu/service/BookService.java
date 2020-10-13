package com.atguigu.service;


import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



/**
 * @Service 注解表示
 *      <bean id ="bookService" class=" com.atguigu.service.BookService"></>
 */
@Service
public class BookService {

    /**
     * @Autowire 实现自动注入
     * 1、先按类型查找并注入
     *
     */
    @Autowired
    @Qualifier("bookDaoExt")
    private BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }

    /**
     * @Autowired标注在方法上，那么此方法会在对象创建之后调用。
     * 		1、先按类型查找参数并调用方法传递<br/>
     * 		2、如果找到多个，就接着按参数名做为id继续查找并注入<br/>
     *		3、如果找到多个。但是参数名做为id找不到，可以使用@Qualifier("bookDao")注解指定id查找并调用<br/>
     *     4、可以通过修改@Autowired(required=false)允许不调用此方法也不报错
     */
    @Autowired(required = false)
    public void setBookDao(@Qualifier("bookDaoExt") BookDao aa){

        System.out.println("bookDao 进来了 啦  ---》 "  + aa);

    }


}
