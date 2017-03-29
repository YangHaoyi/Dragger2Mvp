package com.yhy.draggertest;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Author : YangHaoyi on 2017/3/29.
 * Email  : yanghaoyi@neusoft.com
 * Description :
 */

public class MainPresenter implements MainContract.IPresenter{

    private MainContract.IView view;
    private MainContract.IModel model;
    private Context context;

    @Inject
    public MainPresenter(MainContract.IView view,Context context) {
        this.view = view;
        this.context = context;
        this.model = new MainModel();
    }

    @Override
    public void onButtonClicked(TextView textView, String text) {
        Toast.makeText(context,"1111",Toast.LENGTH_SHORT).show();
        textView.setText(text);
    }

}
