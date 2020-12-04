package com.atguigu.annotation;

@MyAnnotation
public class MyAnnotationTest {

    public static void main(String[] args) {

        Class<MyAnnotationTest> myAnnotationTestClass = MyAnnotationTest.class;

        MyAnnotation annotation = myAnnotationTestClass.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.value());

    }

}
