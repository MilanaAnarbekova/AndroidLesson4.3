package com.example.androidlesson43;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PersonFragment extends Fragment {

    private RecyclerView recyclerView;
    private PersonAdapter personAdapter;
    private ArrayList<Person> personList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        loadData();
        personAdapter = new PersonAdapter(personList);
        recyclerView.setAdapter(personAdapter);
    }

    private void loadData() {
        personList = new ArrayList<>();
        personList.add(new Person("+99965558844","Nazar"));
        personList.add(new Person("+99965558844","Belek"));
        personList.add(new Person("+99965558844","Kairat"));
        personList.add(new Person("+99965558844","Aidana"));
        personList.add(new Person("+99965558844","Azamat"));
        personList.add(new Person("+99965558844","Tomiris"));
        personList.add(new Person("+99965558844","Leila"));
        personList.add(new Person("+99965558844","Milana"));
        personList.add(new Person("+99965558844","Nazar"));
    }
}