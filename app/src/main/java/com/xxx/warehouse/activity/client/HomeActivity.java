package com.xxx.warehouse.activity.client;

import android.content.Intent;

import com.gyf.immersionbar.ImmersionBar;
import com.xxx.warehouse.R;
import com.xxx.warehouse.activity.receive.ReceiveInventoryActivity;
import com.xxx.warehouse.custom.HeadView;
import com.xxx.warehouse.databinding.ActivityHomeBinding;
import com.zrx.mvvmbase.base.BaseActivity;

/**
 * @Author: ZhangRuixiang
 * Date: 2023/4/5
 * DES:
 */
public class HomeActivity extends BaseActivity<HomeViewModel, ActivityHomeBinding> {
    @Override
    protected int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    protected void processLogic() {

        ImmersionBar immersionBar = ImmersionBar.with(this);
        immersionBar.transparentStatusBar();
        immersionBar.init();
        //头部布局
        binding.hvHome.setDataImg(R.color.theme_color, "菜单", true, R.drawable.img_back, false, 0, false, "", onHeadCallBack());

    }

    private HeadView.HeadCallback onHeadCallBack() {
        return new HeadView.HeadCallback() {
            @Override
            public void onLeftBtnClickListener() {
                finish();
            }

            @Override
            public void onRightBtnClickListener() {

            }
        };
    }

    @Override
    protected void setListener() {
        //收货清点
        binding.rlBgOne.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), ReceiveInventoryActivity.class);
            startActivity(intent);
        });
        //上架扫描
        binding.rlBgTwo.setOnClickListener(view -> {

        });
        //拣货下架
        binding.rlBgThree.setOnClickListener(view -> {

        });
        //拣货复核
        binding.rlBgFour.setOnClickListener(view -> {

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
