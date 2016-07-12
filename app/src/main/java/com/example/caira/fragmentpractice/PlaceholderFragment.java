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

//My PlaceholderFragment Class extends fragment 
    public class PlaceholderFragment extends Fragment {

        //Empty constructor used for initialization 
        public PlaceholderFragment(){

        }

        //Override onCreateView and inflate your fragment XML Layout 
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.my_fragment, container, false);
            //Grab my Listview object in code going through the rootview/containter and passing in the ID
            ListView LV = (ListView) container.findViewById(R.id.listy);

            //Here I just created some mock data to use as a temporary ListView feed 
            String[] names ={
                    "Hailey",
                    "Blake",
                    "Valery",
                    "Winter",
                    "Mel",
                    "James"
            };
            //Create my List of type Strings and pass in the mock data source 
            List<String> list = new ArrayList<>(
                    Arrays.asList(names)
            );
            //Create an adapter to combine the data with the actual ListView 
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(),
                    R.layout.my_fragment, R.id.text_view, list);
            //Set the newly created Adapter to the ListView 
            LV.setAdapter(arrayAdapter);
            //Return our ListView for the Fragment Manger to utilize 
            return rootView;
        }
    }

