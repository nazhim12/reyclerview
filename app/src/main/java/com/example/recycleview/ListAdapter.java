package com.example.recycleview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<com.example.recycleview.ListAdapter.ViewHolder> {

    private List<Avenger> hapo;

    public ListAdapter(List<Avenger> hapo) {

        this.hapo = hapo;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_hapo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Avenger avenger = hapo.get(position);
        holder.ivPhoto.setImageResource(avenger.getPhoto());
        holder.tvKarakter.setText(avenger.getKarakter());
        holder.tvName.setText(avenger.getName());
        holder.tvDetail.setText(avenger.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(hapo.get(holder.getAdapterPosition()));
                Intent intent = new Intent(holder.itemView.getContext(), com.example.recycleview.DetailActivity.class);
                intent.putExtra("Image", avenger.getPhoto());
                intent.putExtra("Karakter", avenger.getKarakter());
                intent.putExtra("Name", avenger.getName());
                intent.putExtra("Detail", avenger.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hapo.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvDetail, tvKarakter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.ivFoto);
            tvKarakter = itemView.findViewById(R.id.tvKarakter);
            tvName = itemView.findViewById(R.id.tvNama);
            tvDetail = itemView.findViewById(R.id.tvDetail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Avenger data);
    }
}
