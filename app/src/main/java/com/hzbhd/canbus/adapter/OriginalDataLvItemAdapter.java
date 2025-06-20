package com.hzbhd.canbus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.hzbhd.canbus.R;
import com.hzbhd.canbus.ui_set.OriginalCarDevicePageUiSet;
import com.hzbhd.canbus.util.CommUtil;

import java.util.List;

/* loaded from: classes.dex */
public class OriginalDataLvItemAdapter extends RecyclerView.Adapter<OriginalDataLvItemAdapter.ViewHolder> {
    private final Context mContext;
    private final List<OriginalCarDevicePageUiSet.Item> mList;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public OriginalDataLvItemAdapter(Context context, List<OriginalCarDevicePageUiSet.Item> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_original_data_item_tv, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.mList.isEmpty()) {
            viewHolder.linearLayout.setVisibility(View.INVISIBLE);
        } else {
            viewHolder.linearLayout.setVisibility(android.view.View.VISIBLE);
        }
        viewHolder.tvTitle.setText(CommUtil.getStrIdByResId(this.mContext, this.mList.get(i).getTitleSrn()));
        viewHolder.ivHeadImg.setImageResource(CommUtil.getImgIdByResId(this.mContext, this.mList.get(i).getImageId()));
        viewHolder.tvValue.setText(this.mList.get(i).getValue());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView ivHeadImg;
        private final LinearLayout linearLayout;
        private final TextView tvTitle;
        private final TextView tvValue;

        ViewHolder(View view) {
            super(view);
            this.linearLayout = view.findViewById(R.id.ll_layout);
            this.ivHeadImg = view.findViewById(R.id.iv_head_img);
            this.tvTitle = view.findViewById(R.id.tv_title);
            this.tvValue = view.findViewById(R.id.tv_value);
        }
    }
}
