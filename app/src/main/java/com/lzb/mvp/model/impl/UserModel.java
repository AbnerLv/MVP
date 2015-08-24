package com.lzb.mvp.model.impl;

import com.lzb.mvp.bean.UserBean;
import com.lzb.mvp.model.IUserModel;

/**
 * Created by lvzhenbin on 2015/8/24.
 */
public class UserModel implements IUserModel {
    @Override
    public UserBean load(int id) {
        // 查数据库或者联网获取id的userbean
        return new UserBean("9", "9");
    }

    @Override
    public void setFirstName(String firstName) {
        // 存储firstName
    }

    @Override
    public void setLastName(String lastName) {
        // 存储lastName
    }

    @Override
    public int getID() {
        // 获取id
        return 0;
    }

    @Override
    public void setID(int id) {
        // 存储id
    }
}
