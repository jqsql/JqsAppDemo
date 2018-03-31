package com.jdemo.Utils.BaseRecyclerAdapterUtils.interfaces;


import com.jdemo.Utils.BaseRecyclerAdapterUtils.BaseViewHolder;

/**
 * recycleView  item点击事件
 */

public interface OnRecycleItemClickListener<T> {
    void onClick(BaseViewHolder holder, T t, int position);
}
