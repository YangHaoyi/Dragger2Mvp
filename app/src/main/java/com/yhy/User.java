package com.yhy;

import android.content.Context;

import javax.inject.Inject;

/**
 * Author : YangHaoyi on 2017/3/29.
 * Email  : yanghaoyi@neusoft.com
 * Description :
 */

public class User {
    private String name = "测试dragger";

    private Context context;
    @Inject
    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
