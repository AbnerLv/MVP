package com.lzb.mvp.model;

import com.lzb.mvp.bean.UserBean;

/**
 * Created by lvzhenbin on 2015/8/24.
 */
public interface IUserModel {
    UserBean load(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getID();

    void setID(int id);

}
