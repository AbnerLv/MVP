package com.lzb.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.lzb.mvp.presenter.UserPresenter;
import com.lzb.mvp.view.IUserView;

/**
 * 所谓的mvp，即是（model-处理业务逻辑（主要是数据读写，或者与后台通信（其实也是读写数据）），view-处理ui控件，presenter-主导器，
 * 操作model和view）
 */
public class MainActivity extends Activity
        implements View.OnClickListener, IUserView {

    private UserPresenter presenter;
    private EditText id, first, last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.save).setOnClickListener(this);
        findViewById(R.id.load).setOnClickListener(this);
        id = (EditText) findViewById(R.id.id);
        first = (EditText) findViewById(R.id.first);
        last = (EditText) findViewById(R.id.last);

        presenter = new UserPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.save:
            presenter.saveUser(getID(), getFristName(), getLastName());
            break;
        case R.id.load:
            presenter.loadUser(getID());
            break;
        default:
            break;
        }
    }

    @Override
    public int getID() {
        return new Integer(id.getText().toString());
    }

    @Override
    public String getFristName() {
        return first.getText().toString();
    }

    @Override
    public String getLastName() {
        return last.getText().toString();
    }

    @Override
    public void setLastName(String lastName) {
        last.setText(lastName);
    }

    @Override
    public void setFirstName(String firstName) {
        first.setText(firstName);
    }

}
