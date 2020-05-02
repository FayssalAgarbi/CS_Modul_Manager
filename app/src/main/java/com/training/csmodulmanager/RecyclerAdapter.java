package com.training.csmodulmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ModulHolder>{

    List<String> modules;

    public RecyclerAdapter(List<String> modules) {
        this.modules = modules;
    }

    @NonNull
    @Override
    public ModulHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.expandable_item, parent, false);
        ModulHolder modulHolder = new ModulHolder(view);
        return modulHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ModulHolder holder, int position) {
        holder.AnzahlModuleTextView.setText(String.valueOf(position));
        holder.modulTextView.setText(modules.get(position));
       // holder.ProfessorTextView.setText("Sebastian Bab");
    }

    @Override
    public int getItemCount() {
        return modules.size();
    }

    class ModulHolder extends RecyclerView.ViewHolder{

        TextView modulTextView, ProfessorTextView, AnzahlModuleTextView;

        public ModulHolder(@NonNull View itemView) {
            super(itemView);

            modulTextView = itemView.findViewById(R.id.modulTextView);
            ProfessorTextView = itemView.findViewById(R.id.ProfessorTextView);
            AnzahlModuleTextView = itemView.findViewById(R.id.AnzahlModuleTextView);

        }
    }
}
