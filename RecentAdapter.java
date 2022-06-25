package com.example.uttrakhandtoruism.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uttrakhandtoruism.R;
import com.example.uttrakhandtoruism.model.RecentsData;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecentViewHolder> {
    Context context;
    List<RecentsData>recentsDataList;

    @NonNull
    @Override
    public RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.,parent,false);
        return new RecentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }

    public static final class RecentViewHolder extends RecyclerView.ViewHolder {
        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
