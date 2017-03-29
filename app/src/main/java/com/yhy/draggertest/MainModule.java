package com.yhy.draggertest;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Author : YangHaoyi on 2017/3/29.
 * Email  : yanghaoyi@neusoft.com
 * Description :
 */
@Module
public class MainModule {
    MainContract.IView view;
    Context context;

    public MainModule(MainContract.IView view,Context context) {
        this.view = view;
        this.context = context;
    }
    @Provides
    @Singleton
    MainContract.IView provideILogView() {
        return view;
    }
    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }
}
