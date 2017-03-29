package com.yhy;

import com.yhy.draggertest.MainActivity;
import com.yhy.draggertest.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author : YangHaoyi on 2017/3/29.
 * Email  : yanghaoyi@neusoft.com
 * Description :
 */

@Singleton
@Component(modules = MainModule.class)
public interface  ActivityComponent {
    void inject(MainActivity MainActivity);
}
