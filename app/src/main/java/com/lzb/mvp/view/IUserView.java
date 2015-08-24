package com.lzb.mvp.view;

/**
 * 根据需求可知，View可以对ID、FirstName、LastName这三个EditText进行读操作，对FirstName和LastName进行写操作
 * Created by lvzhenbin on 2015/8/24. 列出需要操作当前view的方法
 */
public interface IUserView {

    int getID();

    String getFristName();

    String getLastName();

    void setLastName(String lastName);

    void setFirstName(String firstName);

}
