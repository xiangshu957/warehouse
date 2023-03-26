package com.xxx.warehouse.activity.login;

import android.app.Application;

import androidx.annotation.NonNull;

import com.xxx.warehouse.api.RepositoryImpl;
import com.zrx.mvvmbase.base.BaseViewModel;

/**
 * @Author: ZhangRuixiang
 * Date: 2023/3/26
 * DES:
 */
public class LoginViewModel extends BaseViewModel<RepositoryImpl> {

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected RepositoryImpl createRepository(RepositoryImpl repository) {
        if (repository == null) {
            repository = new RepositoryImpl();
        }
        return repository;
    }
}
