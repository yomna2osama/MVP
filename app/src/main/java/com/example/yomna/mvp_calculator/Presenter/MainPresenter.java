package com.example.yomna.mvp_calculator.Presenter;

import android.view.View;

import com.example.yomna.mvp_calculator.Model.MainContract;
import com.example.yomna.mvp_calculator.Model.MainModel;

/**
 * Created by yomna on 12/8/2018.
 */

public class MainPresenter implements MainContract.Ipresenter {

    MainContract.Imodel model;
    MainContract.Iview view;

    public MainPresenter(MainContract.Iview newview)
    {
        model = new MainModel();
        view = newview;

    }


    public void onsum(int num1,int num2)
    {
        int data = model.getdata_sum(num1,num2);
        view.ondatarecieve(data);
    }
    public void onminus(int num1,int num2)
    {
        int data = model.getdata_sub(num1,num2);
        view.ondatarecieve(data);
    }
    public void onmul(int num1,int num2)
    {
        int data = model.getdata_mul(num1,num2);
        view.ondatarecieve(data);
    }
    public void ondiv(int num1,int num2)
    {
        int data = model.getdata_div(num1,num2);
        view.ondatarecieve(data);
    }
}
