package com.example.yomna.mvp_calculator.Model;

/**
 * Created by yomna on 12/8/2018.
 */

public class Caculations {
    int num1;
    int num2;
    
    public Caculations(int number1,int number2)
    {
        this.num1=number1;
        this.num2=number2;
    }
    
    public int sumition()
    {
        int result;
        result = num1+num2;
        return result;
    }

    public int subtraction()
    {
        int result;
        result = num1-num2;
        return result;
    }

    public int multiplication()
    {
        int result;
        result = num1*num2;
        return result;
    }

    public int division()
    {
        int result;
        result = num1/num2;
        return result;
    }
    
}
