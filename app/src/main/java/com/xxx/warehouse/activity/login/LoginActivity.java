package com.xxx.warehouse.activity.login;

import android.content.Intent;
import android.view.View;

import com.gyf.immersionbar.ImmersionBar;
import com.xxx.warehouse.R;
import com.xxx.warehouse.activity.client.HomeActivity;
import com.xxx.warehouse.databinding.ActivityLoginBinding;
import com.zrx.mvvmbase.base.BaseActivity;

/**
 * @Author: ZhangRuixiang
 * Date: 2023/3/26
 * DES:
 */
public class LoginActivity extends BaseActivity<LoginViewModel, ActivityLoginBinding> {
    @Override
    protected int getContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    protected void processLogic() {

        ImmersionBar immersionBar = ImmersionBar.with(this);
        immersionBar.transparentStatusBar();
        immersionBar.init();

    }

    @Override
    protected void setListener() {

        binding.slLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void showDialog(String msg) {

    }

    @Override
    protected void hideDialog() {

    }

    @Override
    protected void registerBroadCast() {

    }

    @Override
    protected void unRegisterBroadCast() {

    }
}
