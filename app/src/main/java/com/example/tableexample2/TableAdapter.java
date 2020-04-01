package com.example.tableexample2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.TableViewHolder>
{
    ArrayList<TableModel> tableModels;
    Context context;

    public TableAdapter(ArrayList<TableModel> tableModels, Context context)
    {
        this.tableModels = tableModels;
        this.context = context;
    }

    @NonNull
    @Override
    public TableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_table_column, parent, false);
        return new TableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableViewHolder holder, int position)
    {
        TableModel selectedItem = tableModels.get(position);

        holder.textViewName.setText(selectedItem.getName());
        holder.textViewSerial.setText(selectedItem.getSerial());
        holder.textViewQnt.setText(selectedItem.getQuantity());
        holder.textViewAmount.setText(selectedItem.getAmount());
    }

    @Override
    public int getItemCount() {
        return tableModels.size();
    }

    public class TableViewHolder extends RecyclerView.ViewHolder
    {
        TextView textViewSerial, textViewName, textViewQnt, textViewAmount;

        public TableViewHolder(@NonNull View itemView)
        {
            super(itemView);

            textViewSerial = itemView.findViewById(R.id.text_view_serial);
            textViewName = itemView.findViewById(R.id.text_view_name);
            textViewQnt = itemView.findViewById(R.id.text_view_quantity);
            textViewAmount = itemView.findViewById(R.id.text_view_amount);
        }
    }
}
