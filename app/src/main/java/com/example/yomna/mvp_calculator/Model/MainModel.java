package com.example.yomna.mvp_calculator.Model;

/**
 * Created by yomna on 12/8/2018.
 */

public class MainModel implements MainContract.Imodel {

    Caculations caculations;

    @Override
    public int getdata_sum(int num1,int num2) {

        int result;
        caculations = new Caculations(num1,num2);
        result = caculations.sumition();
        return result;
    }
    public int getdata_sub(int num1,int num2) {

        int result;
        caculations = new Caculations(num1,num2);
        result = caculations.subtraction();
        return result;
    }
    public int getdata_mul(int num1,int num2) {

        int result;
        caculations = new Caculations(num1,num2);
        result = caculations.multiplication();
        return result;
    }
    public int getdata_div(int num1,int num2) {

        int result;
        caculations = new Caculations(num1,num2);
        result = caculations.division();
        return result;
    }
}
