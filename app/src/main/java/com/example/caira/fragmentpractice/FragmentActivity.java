package com.example.caira.fragmentpractice;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        PlaceholderFragment newFragment = new PlaceholderFragment();

        if(savedInstanceState == null) {
            //Begin Fragment Manager Transaction 
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, newFragment)
                    //Remember to commit the changes to the fragment 
                    .commit();
        }
    }
    
    
    //Inner Fragment class extends Fragment 
    public static class PlaceholderFragment extends Fragment{

        //Empty constructor for initilization 
        public PlaceholderFragment(){

        }

        //Remember onCreateView is called whenever the Fragment Transaction begins 
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            //Inflate our rootView Layout 
            View rootView = inflater.inflate(R.layout.my_fragment, container, false);
            //Once inflated, we return it to our transaction Manager 
            return rootView;
        }
    }
}
