package com.lzb.mvp.model.impl;

import com.lzb.mvp.bean.UserBean;
import com.lzb.mvp.model.IUserModel;

/**
 * Created by lvzhenbin on 2015/8/24.
 */
public class UserModel implements IUserModel {
    @Override
    public UserBean load(int id) {
        // �����ݿ����������ȡid��userbean
        return new UserBean("9", "9");
    }

    @Override
    public void setFirstName(String firstName) {
        // �洢firstName
    }

    @Override
    public void setLastName(String lastName) {
        // �洢lastName
    }

    @Override
    public int getID() {
        // ��ȡid
        return 0;
    }

    @Override
    public void setID(int id) {
        // �洢id
    }
}
