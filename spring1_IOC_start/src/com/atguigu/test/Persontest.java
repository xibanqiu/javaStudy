package com.atguigu.test;


import com.atguigu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Persontest {

    @Test
    public void test1(){

        //applicationContent.xml  是 Spring 的配置文件
        //我们需要一个 Spring 容器（Spring IOC 容器） ，再从 容器中获取配置的bean 对象
        //ApplicationContent 接口表示 Spring  IOC 容器
        // Spring 容器 (Spring IOC 容器) 在初始化的时候需要一个配置文件
        // ClassPathXmlApplicationContext 表示 从Classpath  类路径下加载你指定的配置文件名，生成Spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //getBean 是从 Spring 容器 中获取 指定id 值 的bean 对象
        Person p1 = (Person)applicationContext.getBean("p1");

        System.out.println(p1);

    }

    @Test
    public void test2(){
        // 先创建Spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过类型获取Spring容器中的对象
        /**
         * 如果通过类型查找bean对象。<br/>
         * 	1、找到一个就直接返回<br/>
         *  2、找到两个就报错<br/>
         *  3、没有找到也报错
         */
        Person person = applicationContext.getBean(Person.class);
        System.out.println( person );
    }


    @Test
    public void  test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p3 = (Person) applicationContext.getBean("p3");

        System.out.println(p3);
    }

    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p4 = (Person) applicationContext.getBean("p4");
        System.out.println(p4);
    }


    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p5 = (Person) applicationContext.getBean("p5");
        System.out.println(p5);
    }

    @Test
    public void test6() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p6") );
    }

    @Test
    public void test7() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println( applicationContext.getBean("p7") );
    }


}
