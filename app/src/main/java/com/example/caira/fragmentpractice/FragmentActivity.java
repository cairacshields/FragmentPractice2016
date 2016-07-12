package com.example.caira.fragmentpractice;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        PlaceholderFragment newFragment = new PlaceholderFragment();

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, newFragment)
                    .commit();
        }
    }

    public static class PlaceholderFragment extends Fragment{

        public PlaceholderFragment(){

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.my_fragment, container, false);
            ListView LV = (ListView)rootView.findViewById(R.id.list_view);

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
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), R.layout.my_fragment, R.id.text_view, list);
            LV.setAdapter(arrayAdapter);
            return rootView;
        }
    }
}
