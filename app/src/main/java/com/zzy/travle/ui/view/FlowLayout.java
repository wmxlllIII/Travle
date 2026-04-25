package com.zzy.travle.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {
    private int horizontalSpacing = 10;
    private int verticalSpacing = 10;

    public FlowLayout(Context context) {
        super(context);
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int width = getWidth();
        int left = 0;
        int top = 0;
        int rowMaxHeight = 0;

        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (child.getVisibility() == GONE) continue;

            int childWidth = child.getMeasuredWidth();
            int childHeight = child.getMeasuredHeight();

            if (left + childWidth > width) {
                left = 0;
                top += rowMaxHeight + verticalSpacing;
                rowMaxHeight = 0;
            }

            child.layout(left, top, left + childWidth, top + childHeight);
            left += childWidth + horizontalSpacing;
            rowMaxHeight = Math.max(rowMaxHeight, childHeight);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int height = 0;
        int rowWidth = 0;
        int rowHeight = 0;

        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            measureChild(child, widthMeasureSpec, heightMeasureSpec);

            int cw = child.getMeasuredWidth();
            int ch = child.getMeasuredHeight();

            if (rowWidth + cw > widthSize) {
                height += rowHeight + verticalSpacing;
                rowWidth = cw;
                rowHeight = ch;
            } else {
                rowWidth += cw + horizontalSpacing;
                rowHeight = Math.max(rowHeight, ch);
            }
        }
        height += rowHeight;
        setMeasuredDimension(widthSize, height);
    }
}
