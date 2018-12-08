package com.example.yomna.mvp_calculator.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.yomna.mvp_calculator.Model.MainContract;
import com.example.yomna.mvp_calculator.Presenter.MainPresenter;
import com.example.yomna.mvp_calculator.R;

public class MainActivity extends AppCompatActivity implements MainContract.Iview {

    private EditText num1;
    private EditText num2;
    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

    }

    public void onminus(View view)
    {
        presenter.onminus(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()));
    }

    public void onmul(View view)
    {
        presenter.onmul(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()));
    }
    public void ondiv(View view)
    {
        presenter.ondiv(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()));
    }
    public void onsum(View view)
    {
        presenter.onsum(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()));
    }
    @Override
    public void ondatarecieve(int data) {
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(getString(data));
    }
}
