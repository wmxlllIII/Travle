package com.zzy.travle.ui.fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.zzy.travle.data.manager.AccountManager;
import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.databinding.FragmentMineBinding;
import com.zzy.travle.ui.activity.AboutActivity;
import com.zzy.travle.ui.activity.MyFavoriteActivity;
import com.zzy.travle.ui.activity.SettingActivity;
import com.zzy.travle.util.LoginChecker;

public class MineFragment extends BaseFragment<FragmentMineBinding> {

    public static final String TAG = "MineFragment";

    @Override
    protected FragmentMineBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMineBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {
        mBinding.ivAvatar.setOnClickListener(v -> checkIsLogin());
        mBinding.tvUsername.setOnClickListener(v -> checkIsLogin());
        mBinding.tvUserId.setOnClickListener(v -> checkIsLogin());

        mBinding.llMyFavorite.setOnClickListener(v -> {
            if (!checkIsLogin()) {
                return;
            }

            startActivity(new Intent(getContext(), MyFavoriteActivity.class));
        });

        mBinding.llMyOrder.setOnClickListener(v -> {
            if (!checkIsLogin()) {
                return;
            }

            // 订单页面
        });

        mBinding.llMyComment.setOnClickListener(v -> {
            if (!checkIsLogin()) {
                return;
            }

            // 评论页面
        });

        mBinding.llFeedback.setOnClickListener(v -> {
            // 反馈页面
        });

        mBinding.llSettings.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), SettingActivity.class));
        });

        mBinding.llAbout.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), AboutActivity.class));
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        refreshUserInfo();
    }

    @Override
    protected void initData() {
        refreshUserInfo();
    }

    private void refreshUserInfo() {
        UserVO user = AccountManager.getInstance().getLoginUser();
        if (user != null) {
            mBinding.tvUsername.setText(user.getUsername());
            mBinding.tvUserId.setText("ID: " + user.getUserId());

        } else {
            mBinding.tvUsername.setText("未登录");
            mBinding.tvUserId.setText("点击登录/注册");

        }

        //todo 更新数量
        mBinding.tvFavoriteCount.setText("0");
        mBinding.tvHistoryCount.setText("0");
        mBinding.tvCommentCount.setText("0");
    }

    private boolean checkIsLogin() {
        return LoginChecker.checkLogin(getContext());
    }

}