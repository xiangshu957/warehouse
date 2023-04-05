package com.xxx.warehouse.activity.receive;

import com.gyf.immersionbar.ImmersionBar;
import com.xxx.warehouse.R;
import com.xxx.warehouse.custom.HeadView;
import com.xxx.warehouse.databinding.ActivityReceiveInventoryBinding;
import com.zrx.mvvmbase.base.BaseActivity;

/**
 * @Author: ZhangRuixiang
 * Date: 2023/4/5
 * DES:
 */
public class ReceiveInventoryActivity extends BaseActivity<ReceiveInventoryViewModel, ActivityReceiveInventoryBinding> {

    @Override
    protected int getContentViewId() {
        return R.layout.activity_receive_inventory;
    }

    @Override
    protected void processLogic() {

        ImmersionBar immersionBar = ImmersionBar.with(this);
        immersionBar.transparentStatusBar();
        immersionBar.init();
        //头部布局
        binding.hvReceiveInventory.setDataImg(R.color.theme_color, "菜单", true, R.drawable.img_back, false, 0, false, "", onHeadCallBack());

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
