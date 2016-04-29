package com.concretepage.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.cp.android.R;

/**
 * Created by HP PC on 4/26/2016.
 */
public class FragmentFour extends Fragment {
    TextView output1, sleep, jobDetails, diet, sleept, job;
    ImageButton confirmButton;

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_four, viewGroup, false);
            super.onActivityCreated(savedInstanceState);

            output1= (TextView)view.findViewById(R.id.diet_text_view);
            sleep = (TextView)view.findViewById(R.id.sleep_text_view);
            jobDetails = (TextView)view.findViewById(R.id.job_text_view);
            diet = (TextView)view.findViewById(R.id.name);
            sleept = (TextView)view.findViewById(R.id.slp);
            job = (TextView)view.findViewById(R.id.job);


            SharedPreferences prefs;
            prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
            String data = prefs.getString("data", null);
            output1.setText(data);

            SharedPreferences prefs1;
            prefs1 = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
            String data1 = prefs1.getString("data1", null);
            sleep.setText(data1);

            SharedPreferences prefs2;
            prefs2 = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
            String data2 = prefs2.getString("data2", null);
            jobDetails.setText(data2);


            View.OnClickListener listener = new View.OnClickListener() {
                public void onClick(View view1) {

                    Fragment fragment = null;
                    if(view1 == view1.findViewById(R.id.img_tbnfr_4))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                    {  fragment = new FragmentFive();

                    }

                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.output, fragment).addToBackStack( "tag" ).commit();
                    // transaction.commit();
                }
            };

            confirmButton = (ImageButton) view.findViewById(R.id.img_tbnfr_4);
            confirmButton.setOnClickListener(listener);

            diet.setOnTouchListener(new View.OnTouchListener() {
                Fragment fragment = null;
                public boolean onTouch(View v, MotionEvent event) {

                    fragment = new FragmentOne();
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.output, fragment);//.addToBackStack( "tag" ).commit();
                    transaction.commit();
                    return false;
                }
            });

            sleept.setOnTouchListener(new View.OnTouchListener() {
                Fragment fragment = null;
                public boolean onTouch(View v, MotionEvent event) {


                    fragment= new FragmentTwo();
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.output, fragment);//.addToBackStack( "tag" ).commit();
                    transaction.commit();
                    return false;

                }

            });

            job.setOnTouchListener(new View.OnTouchListener() {
                Fragment fragment = null;
                public boolean onTouch(View v, MotionEvent event) {
                    fragment= new FragmentThree();
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.output, fragment);//.addToBackStack( "tag" ).commit();
                    transaction.commit();
                    return false;

                }

            });


            return view;
    }

}
