package com.atguigu.calculat;


import org.springframework.stereotype.Component;

@Component
public class Calculator implements Calculate {

    @Override
    public int add(int num1, int num2) {
        int result = 0;

       result = num1 + num2;

        return result;
    }

    @Override
    public int add(int num1, int num2, int num3) {
        int result = 0;
        result = num1 + num2 + num3;
        return result;
    }

    @Override
    public int div(int num1, int num2) {
        int result = 0;
        result = num1 / num2;
        return result;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
    }

}



