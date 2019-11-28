package com.example.microporcessor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CrossWalkAdapter extends RecyclerView.Adapter<CrossWalkAdapter.CustomViewHolder>{
    private ArrayList<CrossWalkData> mList = null;
    private Activity context = null;


    public CrossWalkAdapter(Activity context, ArrayList<CrossWalkData> list) {
        this.context = context;
        this.mList = list;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView id;
        protected TextView date;
        protected TextView changes;



        public CustomViewHolder(View view) {
            super(view);
            this.id = (TextView) view.findViewById(R.id.textView_id);
            this.date = (TextView) view.findViewById(R.id.textView_date);
            this.changes = (TextView) view.findViewById(R.id.textView_changes);
        }
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_retrieve, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewholder, int position) {

        viewholder.id.setText(mList.get(position).getCrossalk_id());
        viewholder.date.setText(mList.get(position).getCrosswalk_date());
        viewholder.changes.setText(mList.get(position).getCrosswalk_changes());
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}
