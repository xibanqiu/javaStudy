package com.atguigu.utils;

import java.util.Arrays;

public class LogUtils {


    public static void logBefore(String method ,Object ... args){

        System.out.println("前置日记是：当前是【" + method + "】操作，参数是：" + Arrays.asList(args));

    }

    public static void logAfter(String method ,Object ... args){

        System.out.println("后置日记是：当前是【" + method + "】操作，参数是：" + Arrays.asList(args));

    }

    public static void logAfterThrowing(String method ,Exception e){

        System.out.println("异常日记是：当前是【" + method + "】操作，参数是：" + e);

    }

    public static void logAfterReturn(String method ,Object result){

        System.out.println("异常日记是：当前是【" + method + "】操作，参数是：" + result);

    }

}
