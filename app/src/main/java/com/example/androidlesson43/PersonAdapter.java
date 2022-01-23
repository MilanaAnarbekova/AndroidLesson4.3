package com.example.androidlesson43;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<Person> person = new ArrayList<>();

    public PersonAdapter(ArrayList<Person> person) {
        this.person = person;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_person,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Bind(person.get(position));
    }

    @Override
    public int getItemCount() {
        return person.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,number;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);

        }

        public void Bind(Person person) {
        number.setText(person.getNumber());
        name.setText(person.getName());
        }
    }
}
