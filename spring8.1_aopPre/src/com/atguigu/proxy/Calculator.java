package com.atguigu.proxy;


import com.atguigu.calculat.Calculate;
import com.atguigu.utils.LogUtils;


public class Calculator implements Calculate {

    @Override
    public int add(int num1, int num2) {
        int result = 0;
        try {
            try {
                LogUtils.logBefore("add", num1, num2);
                result = num1 + num2;
            } finally {
                LogUtils.logAfter("add", num1, num2);
            }
            LogUtils.logAfterReturning("add", result);
        } catch (Exception e) {
            LogUtils.logAfterThrowing("add", e);
            throw e;
        }
        return result;
    }

    @Override
    public int add(int num1, int num2, int num3) {
        int result = 0;
        try {
            try {
                LogUtils.logBefore("add", num1, num2, num3);
                result = num1 + num2 + num3;
            } finally {
                LogUtils.logAfter("add", num1, num2, num3);
            }
            LogUtils.logAfterReturning("add", result);
        } catch (Exception e) {
            LogUtils.logAfterThrowing("add", e);
            throw e;
        }
        return result;
    }

    @Override
    public int div(int num1, int num2) {
        int result = 0;
        try {
            try {
                LogUtils.logBefore("div", num1, num2);
                result = num1 / num2;
            } finally {
                LogUtils.logAfter("div", num1, num2);
            }
            LogUtils.logAfterReturning("add", result);
        } catch (Exception e) {
            LogUtils.logAfterThrowing("div", e);
            throw e;
        }
        return result;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
    }

}



