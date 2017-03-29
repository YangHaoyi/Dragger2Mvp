package com.yhy.draggertest;

import android.app.Activity;
import android.widget.TextView;

/**
 * Author : YangHaoyi on 2017/3/29.
 * Email  : yanghaoyi@neusoft.com
 * Description :
 */

public class MainContract {
    interface IView {
        void onButtonClicked(String text);
    }
    interface IModel {
        void onButtonClicked(Activity activity, String text);
    }

    interface IPresenter {
        void onButtonClicked(TextView textView, String text);
    }
}
