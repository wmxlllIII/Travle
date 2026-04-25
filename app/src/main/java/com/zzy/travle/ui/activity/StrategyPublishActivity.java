package com.zzy.travle.ui.activity;

import android.view.Gravity;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.GridLayoutManager;

import com.zzy.travle.R;
import com.zzy.travle.data.manager.DataCallback;
import com.zzy.travle.data.manager.SpotManager;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.databinding.ActivityStrategyPublishBinding;
import com.zzy.travle.ui.adapter.ImagePickerAdapter;
import com.zzy.travle.ui.adapter.interfaces.OnPickerClickListener;
import com.zzy.travle.util.TravleToast;

import java.util.ArrayList;
import java.util.List;

public class StrategyPublishActivity extends BaseActivity<ActivityStrategyPublishBinding> {


    public static final String TAG = "StrategyPublishActivity";
    private static final int MAX_IMAGE_COUNT = 9;

    private final ImagePickerAdapter mImageAdapter = new ImagePickerAdapter(new OnPickerClickListenerImpl());
    private final SpotManager mSpotManager = new SpotManager();
    private final SearchSpotCallback mSearchSpotCallback = new SearchSpotCallback();
    private final List<String> mSelectedTags = new ArrayList<>();

    private final ActivityResultLauncher<String> mPickImageLauncher = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            uri -> {
                if (uri != null) {
                    List<String> currentList = new ArrayList<>(mImageAdapter.getCurrentList());
                    currentList.add(uri.toString());
                    mImageAdapter.submitList(currentList);
                }
            }
    );

    @Override
    protected int getLayoutId() {
        return R.layout.activity_strategy_publish;
    }

    @Override
    protected void initView() {
        mBinding.ivBack.setOnClickListener(v -> finish());
        mBinding.tvPublish.setOnClickListener(v -> publishStrategy());

        // 图片列表
        mBinding.rvImages.setLayoutManager(new GridLayoutManager(this, 3));
        mBinding.rvImages.setAdapter(mImageAdapter);

        mBinding.llAddImage.setOnClickListener(v -> pickImage());
        mBinding.llAddTag.setOnClickListener(v -> showTagSelectionDialog());
    }

    @Override
    protected void initData() {
        mSpotManager.loadScenicList(mSearchSpotCallback);
    }

    // 选择图片
    private void pickImage() {
        if (mImageAdapter.getItemCount() >= MAX_IMAGE_COUNT) {
            TravleToast.showToast(this, "最多上传9张图片");
            return;
        }
        mPickImageLauncher.launch("image/*");
    }

    private void removeImage(int position) {
        List<String> list = new ArrayList<>(mImageAdapter.getCurrentList());
        list.remove(position);
        mImageAdapter.submitList(list);
    }

    private void showTagSelectionDialog() {
        mSpotManager.loadScenicList(new DataCallback<List<ScenicSpotVO>>() {
            @Override
            public void onSuccess(List<ScenicSpotVO> data) {
                if (data == null || data.isEmpty()) {
                    TravleToast.showToast(StrategyPublishActivity.this, "暂无景点");
                    return;
                }
                showSpotDialog(data);
            }

            @Override
            public void onError(String error) {
                TravleToast.showToast(StrategyPublishActivity.this, "加载失败：" + error);
            }
        });
    }

    private void showSpotDialog(List<ScenicSpotVO> spots) {
        String[] names = new String[spots.size()];
        for (int i = 0; i < spots.size(); i++) {
            names[i] = spots.get(i).getName();
        }

        new android.app.AlertDialog.Builder(this)
                .setTitle("选择景点")
                .setItems(names, (dialog, which) -> addTag(names[which]))
                .setNegativeButton("取消", null)
                .show();
    }

    private void addTag(String tagName) {
        if (mSelectedTags.contains(tagName)) {
            TravleToast.showToast(this, "已添加该景点");
            return;
        }
        mSelectedTags.add(tagName);
        refreshTagLayout();
    }

    private void removeTag(String tagName) {
        mSelectedTags.remove(tagName);
        refreshTagLayout();
    }

    private void refreshTagLayout() {
        mBinding.flowLayoutTags.removeAllViews();
        mSelectedTags.forEach(this::addTagView);
    }

    private void addTagView(String tag) {
        TextView tagView = createTagTextView(tag);
        mBinding.flowLayoutTags.addView(tagView);
    }

    private TextView createTagTextView(String text) {
        TextView tv = new TextView(this);
        tv.setText(text + "  ×");
        tv.setTextSize(14);
        tv.setTextColor(getResources().getColor(R.color.white));
        tv.setBackgroundResource(R.drawable.bg_tag); // 简约标签背景

        tv.setPadding(25, 15, 25, 15);
        tv.setGravity(Gravity.CENTER);

        tv.setOnClickListener(v -> removeTag(text));
        return tv;
    }

    private void publishStrategy() {
        String title = mBinding.etTitle.getText().toString().trim();
        String content = mBinding.etContent.getText().toString().trim();

        if (title.isEmpty()) {
            TravleToast.showToast(this, "请输入标题");
            return;
        }
        if (content.isEmpty()) {
            TravleToast.showToast(this, "请输入内容");
            return;
        }
        if (mImageAdapter.getItemCount() == 0) {
            TravleToast.showToast(this, "请至少添加一张图片");
            return;
        }
        //todo 发布逻辑

    }

    private class SearchSpotCallback implements DataCallback<List<ScenicSpotVO>> {

        @Override
        public void onSuccess(List<ScenicSpotVO> data) {
            if (data == null || data.isEmpty()) {
                TravleToast.showToast(StrategyPublishActivity.this, "暂无景点数据");
                return;
            }

//            showSpotSelectionDialog(data);
        }

        @Override
        public void onError(String error) {
            TravleToast.showToast(StrategyPublishActivity.this, "加载景点失败：" + error);
        }
    }

    private class OnPickerClickListenerImpl implements OnPickerClickListener {

        @Override
        public void onClick(int position) {

        }

        @Override
        public void onRemove(int position) {
            removeImage(position);
        }
    }

}