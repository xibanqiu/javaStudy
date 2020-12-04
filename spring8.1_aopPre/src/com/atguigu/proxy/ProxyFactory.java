package com.atguigu.proxy;

import com.atguigu.calculat.Calculate;
import com.atguigu.calculat.CalculatorSimple;
import com.atguigu.utils.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    // jdk 动态代理
    public static Object jdkProxy(Object target){

        return  Proxy.newProxyInstance( target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    Object result = null;
                    try {
                        try {
                            LogUtils.logBefore(method.getName(),args);

                            result = method.invoke(target,args);
                        } finally {
                            LogUtils.logAfter(method.getName(),args);
                        }
                        LogUtils.logAfterReturning(method.getName(), result);
                    } catch (Exception e) {
                        LogUtils.logAfterThrowing(method.getName(), e);
                        throw e;
                    }
                    return result;

            }
        });
    }



    public static void main(String[] args) {

        CalculatorSimple cc = new CalculatorSimple();

        Calculate proxy = (Calculate) jdkProxy(cc);

        System.out.println(proxy.add(1, 2));
//        System.out.println(proxy.div(100, 0));


    }


}
