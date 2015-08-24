package com.lzb.mvp.presenter;

import com.lzb.mvp.bean.UserBean;
import com.lzb.mvp.model.IUserModel;
import com.lzb.mvp.model.impl.UserModel;
import com.lzb.mvp.view.IUserView;

/**
 * 建立presenter（主导器，通过iView和iModel接口操作model和view），activity可以把所有逻辑给presenter处理，
 * 这样java逻辑就从手机的activity中分离出来 Created by lvzhenbin on 2015/8/24.
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
        mUserView.setFirstName(user.getFirstName());// 通过调用IUserView的方法来更新显示
        mUserView.setLastName(user.getLastName());
    }
}
