package com.lzb.mvp.view;

/**
 * ���������֪��View���Զ�ID��FirstName��LastName������EditText���ж���������FirstName��LastName����д����
 * Created by lvzhenbin on 2015/8/24. �г���Ҫ������ǰview�ķ���
 */
public interface IUserView {

    int getID();

    String getFristName();

    String getLastName();

    void setLastName(String lastName);

    void setFirstName(String firstName);

}
