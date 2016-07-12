package com.example.caira.fragmentpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Caira on 7/11/2016.
 */

    public class PlaceholderFragment extends Fragment {

        public PlaceholderFragment(){

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.my_fragment, container, false);
            ListView LV = (ListView) container.findViewById(R.id.listy);

            String[] names ={
                    "Hailey",
                    "Blake",
                    "Valery",
                    "Winter",
                    "Mel",
                    "James"
            };
            List<String> list = new ArrayList<>(
                    Arrays.asList(names)
            );
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(),
                    R.layout.my_fragment, R.id.text_view, list);

            LV.setAdapter(arrayAdapter);

            return rootView;
        }
    }

