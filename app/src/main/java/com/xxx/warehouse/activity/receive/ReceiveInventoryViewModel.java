package com.xxx.warehouse.activity.receive;

import android.app.Application;

import androidx.annotation.NonNull;

import com.xxx.warehouse.api.RepositoryImpl;
import com.zrx.mvvmbase.base.BaseViewModel;

/**
 * @Author: ZhangRuixiang
 * Date: 2023/4/5
 * DES:
 */
public class ReceiveInventoryViewModel extends BaseViewModel<RepositoryImpl> {

    public ReceiveInventoryViewModel(@NonNull Application application) {
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
