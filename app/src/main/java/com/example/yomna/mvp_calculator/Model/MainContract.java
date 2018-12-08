package com.example.yomna.mvp_calculator.Model;

/**
 * Created by yomna on 12/8/2018.
 */

public class MainContract {

    public interface Iview
    {
        public void ondatarecieve(int data);

    }

    public interface Ipresenter
    {
        public void onsum(int num1,int num2);
        public void onminus(int num1,int num2);
        public void onmul(int num1,int num2);
        public void ondiv(int num1,int num2);
    }

    public interface Imodel
    {
        public int getdata_sum(int num1,int num2);
        public int getdata_sub(int num1,int num2);
        public int getdata_mul(int num1,int num2);
        public int getdata_div(int num1,int num2);

    }

}
