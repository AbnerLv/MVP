package com.lzb.mvp.presenter;

import com.lzb.mvp.bean.UserBean;
import com.lzb.mvp.model.IUserModel;
import com.lzb.mvp.model.impl.UserModel;
import com.lzb.mvp.view.IUserView;

/**
 * ����presenter����������ͨ��iView��iModel�ӿڲ���model��view����activity���԰������߼���presenter����
 * ����java�߼��ʹ��ֻ���activity�з������ Created by lvzhenbin on 2015/8/24.
 */
public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());// ͨ������IUserView�ķ�����������ʾ
        mUserView.setLastName(user.getLastName());
    }
}
