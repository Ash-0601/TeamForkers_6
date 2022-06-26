package com.example.uttrakhandtoruism.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




import com.example.dreamtravel.R;
import com.example.dreamtravel.model.RecentData;

import java.util.List;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecentViewHolder> {

    Context context;
    List<RecentData>recentsDataList;

    @NonNull
    @Override
    public RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false);
        return new RecentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentViewHolder holder, int position) {
        holder.countryname.setText(recentsDataList.get(position).getCountryname());
        holder.placename.setText(recentsDataList.get(position).getPlacename());
        holder.state.setText(recentsDataList.get(position).getState());
        holder.imageView2.setImageResource(recentsDataList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }

    public static final class RecentViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView2;
        TextView placename,countryname,state;
        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2=itemView.findViewById(R.id.imageView);
            placename=itemView.findViewById(R.id.textView);
            countryname=itemView.findViewById(R.id.textView);
            state=itemView.findViewById(R.id.textView);

        }
    }
}
