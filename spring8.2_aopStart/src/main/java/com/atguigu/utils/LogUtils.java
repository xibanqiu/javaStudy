package com.atguigu.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class LogUtils {


    @Before(value = "execution(public int com.com.atguigu.pojo.atguigu.calculat.Calculator.add(..))")
    public static void logBefore(JoinPoint joinPoint){

        System.out.println("前置日记是：当前是【" + joinPoint.getSignature().getName() + "】操作，参数是：" + Arrays.asList(joinPoint.getArgs()));

    }

    @After(value = "execution(* com.com.atguigu.pojo.atguigu.calculat.*.*(..))")
    public static void logAfter(JoinPoint joinPoint){

        System.out.println("后置日记是：当前是【" +  joinPoint.getSignature().getName() + "】操作，参数是：" + Arrays.asList(joinPoint.getArgs()));

    }

    @AfterThrowing(value = "execution(* com.com.atguigu.pojo.atguigu.calculat.*.*(..))",throwing="e")
    public static void logAfterThrowing(JoinPoint joinPoint,Exception e){

        System.out.println("异常日记是：当前是【" + joinPoint.getSignature().getName()  + "】操作，参数是：" + e);

    }

    @AfterReturning(value = "execution(* com.com.atguigu.pojo.atguigu.calculat.*.*(..))", returning = "result")
    public static void logAfterReturning(JoinPoint joinPoint ,Object result){

        System.out.println("异常日记是：当前是【" + joinPoint.getSignature().getName() + "】操作，参数是：" + result);

    }


    @Around(value = "execution(* com.com.atguigu.pojo.atguigu.calculat.*.*(..))")
    public static Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result = null;
        try {
            try {
                System.out.println("环绕 的 前置通知");
                // 执行目标方法
                Object proceed = proceedingJoinPoint.proceed();


            } finally {
                System.out.println("环绕 的 后置通知");
            }
            System.out.println("环绕 的 返回值通知");
        } catch (Exception e) {
            System.out.println("环绕 的 异常通知");
            throw e;
        }
        return result;
    }


}


