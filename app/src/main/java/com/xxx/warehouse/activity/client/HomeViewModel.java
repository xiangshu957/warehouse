package com.xxx.warehouse.activity.client;

import android.app.Application;

import androidx.annotation.NonNull;

import com.xxx.warehouse.api.RepositoryImpl;
import com.zrx.mvvmbase.base.BaseViewModel;

/**
 * @Author: ZhangRuixiang
 * Date: 2023/4/5
 * DES:
 */
public class HomeViewModel extends BaseViewModel<RepositoryImpl> {

    public HomeViewModel(@NonNull Application application) {
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
