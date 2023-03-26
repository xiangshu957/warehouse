package com.xxx.warehouse.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import com.xxx.warehouse.R;


/**
 * @Author: ZhangRuixiang
 * Date: 2020/12/23
 * DES:
 */
public class HeadView extends FrameLayout implements View.OnClickListener {

    private Context context;
    private View view;
    private RelativeLayout headRlRight;
    private RelativeLayout headRl;
    private ImageView headImgLeft, headImgRight;
    private TextView headTvTitle, headTvRight;
    private HeadCallback headCallback;

    public HeadView(@NonNull Context context) {
        super(context);
        initView(context);
    }

    public HeadView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public HeadView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public HeadView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }

    private void initView(Context context) {
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.layout_headview, this);
        headRl = view.findViewById(R.id.head_rl);
        headImgLeft = view.findViewById(R.id.head_img_left);
        headImgRight = view.findViewById(R.id.head_img_right);
        headTvTitle = view.findViewById(R.id.head_tv_title);
        headTvRight = view.findViewById(R.id.head_tv_right);
        headRlRight = view.findViewById(R.id.head_rl_right);
    }

    @SuppressLint("ResourceType")
    public void setData(@ColorRes int colorId, String titleString, boolean leftImgVisibility,
                        @DrawableRes int leftImgId, boolean rightImgVisibility,
                        @DrawableRes int rightImgId, boolean rightTvVisibility,
                        @StringRes int rightTvId, HeadCallback headCallback) {
        this.headCallback = headCallback;

        if (leftImgVisibility) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }

        if (leftImgId != 0) {
            headImgLeft.setImageResource(leftImgId);
        }

        if (rightImgVisibility) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }

        if (rightImgId != 0) {
            headImgRight.setImageResource(rightImgId);
        }

        if (rightTvVisibility) {
            headTvRight.setVisibility(View.VISIBLE);
        } else {
            headTvRight.setVisibility(View.INVISIBLE);
        }

        if (rightTvId != 0) {
            headImgLeft.setImageResource(rightTvId);
        }

        headRlRight.setOnClickListener(this);
        headTvTitle.setText(titleString);

    }

    public TextView getHeadTvRight() {
        return headTvRight;
    }

    public void setData(int height, @DimenRes int dimenId, @ColorRes int colorId, String titleText, boolean leftImgVisibiliy,
                        @DrawableRes int leftImgId, boolean rightImgVisibiliy,
                        @DrawableRes int rightImgId, boolean rightTvVisibiliy,
                        @StringRes int rightTvId, HeadCallback headCallBack) {
        this.headCallback = headCallBack;
        if (colorId != 0) {
            headRl.setBackgroundColor(getResources().getColor(colorId));
        }

        if (leftImgVisibiliy) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId != 0) {
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibiliy) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId != 0) {
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibiliy) {
            headTvRight.setVisibility(View.VISIBLE);
        } else {
            headTvRight.setVisibility(View.INVISIBLE);
        }
        if (rightTvId != 0) {
            headTvRight.setText(rightTvId);
        }

        headRlRight.setOnClickListener(this);
        if (height != 0) {
            LayoutParams layoutParams = (LayoutParams) headRl.getLayoutParams();
            layoutParams.height = height;
            headRl.setLayoutParams(layoutParams);
        }
        if (dimenId != 0) {
            headTvTitle.setTextSize(getResources().getDimension(dimenId));
        }

        headTvTitle.setText(titleText);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void setDataImg(@DrawableRes int drawableId, String titleText, boolean leftImgVisibility,
                           @DrawableRes int leftImgId, boolean rightImgVisibility,
                           @DrawableRes int rightImgId, boolean rightTvVisibility,
                           String rightTvText, HeadCallback headCallBack) {
        this.headCallback = headCallBack;
        if (drawableId != 0) {
            headRl.setBackground(getResources().getDrawable(drawableId));
        }
        if (leftImgVisibility) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId != 0) {
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibility) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId != 0) {
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibility) {
            headTvRight.setVisibility(View.VISIBLE);
        } else {
            headTvRight.setVisibility(View.INVISIBLE);
        }

        headTvRight.setText(rightTvText);

        headRlRight.setOnClickListener(this);

        headTvTitle.setText(titleText);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void setDataImg(int height, @DimenRes int dimenId, @DrawableRes int drawableId, String titleText, boolean leftVisibiliy,
                           @DrawableRes int leftImgId, boolean rightImgVisibility,
                           @DrawableRes int rightImgId, boolean rightTvVisibility,
                           @StringRes int rightTvId, HeadCallback headCallBack) {
        this.headCallback = headCallBack;
        if (drawableId != 0) {
            headRl.setBackground(getResources().getDrawable(drawableId));
        }
        if (leftVisibiliy) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId != 0) {
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibility) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId != 0) {
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibility) {
            headTvRight.setVisibility(View.VISIBLE);
        } else {
            headTvRight.setVisibility(View.INVISIBLE);
        }
        if (rightTvId != 0) {
            headTvRight.setText(rightTvId);
        }

        headRlRight.setOnClickListener(this);
        if (height != 0) {
            LayoutParams layoutParams = (LayoutParams) headRl.getLayoutParams();
            layoutParams.height = height;
            headRl.setLayoutParams(layoutParams);
        }
        if (dimenId != 0) {
            headTvTitle.setTextSize(getResources().getDimension(dimenId));
        }
        headTvTitle.setText(titleText);
    }

    public TextView getTvRight() {
        return headTvRight;
    }

    @Override
    public void onClick(View v) {
        if (headCallback != null) {
            if (v.getId() == R.id.head_img_left) {
                headCallback.onLeftBtnClickListener();
            } else if (v.getId() == R.id.head_rl_right) {
                headCallback.onRightBtnClickListener();
            }
        }
    }

    public interface HeadCallback {

        /**
         * 左边按钮点击监听
         */
        void onLeftBtnClickListener();

        /**
         * 右边按钮点击监听
         */
        void onRightBtnClickListener();

    }
}
