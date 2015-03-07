package com.ejay.kingoftheroad;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A0097973 on 3/7/2015.
 */
public class MyAdapter<E extends RouteData> extends RecyclerView.Adapter {

    private List<E> items;

    public MyAdapter(List<E> data) {
        items = data; // Assuming never null
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.cards_layout,
                viewGroup,
                false
        );
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((MyViewHolder)viewHolder).textViewName.setText(items.get(i).name);
        ((MyViewHolder)viewHolder).textViewEmail.setText(items.get(i).email);
    }

    @Override
    public int getItemCount() {
        return 25;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public final TextView textViewName;
        public final TextView textViewEmail;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewEmail = (TextView) itemView.findViewById(R.id.textViewEmail);
        }
    }
}
