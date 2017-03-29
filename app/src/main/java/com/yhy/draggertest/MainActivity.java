package com.yhy.draggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.yhy.DaggerActivityComponent;
import com.yhy.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.IView{

    @Inject
    User user;
    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder().mainModule(new MainModule(this,this)).build().inject(this);
        TextView tvDragger = (TextView) findViewById(R.id.tvDragger);
        tvDragger.setText(user.getName());
        presenter.onButtonClicked(tvDragger,"123456789");
    }

    @Override
    public void onButtonClicked(String text) {

    }
}
