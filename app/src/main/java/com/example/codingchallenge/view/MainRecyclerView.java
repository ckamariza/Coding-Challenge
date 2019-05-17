package com.example.codingchallenge.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.codingchallenge.R;
import com.example.codingchallenge.models.Titles;

public class MainRecyclerView extends RecyclerView.Adapter<MainRecyclerView.BaseViewHolder> {
    private Titles items = new Titles();
    @NonNull
    @Override
    public MainRecyclerView.BaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BaseViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.list_item, viewGroup,false));
    }

    public void updateDataSet(Titles items){
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecyclerView.BaseViewHolder baseViewHolder, int i) {
        baseViewHolder.textView.setText(items.response.getItems().get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return items.response.getItems().size();
    }

    public class BaseViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
        public BaseViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
