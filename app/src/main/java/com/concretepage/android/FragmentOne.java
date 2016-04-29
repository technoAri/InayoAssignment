package com.concretepage.android;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.cp.android.R;
 
public class FragmentOne extends Fragment {

    ImageButton imageButton1Frg1, imageButton2Frg1, imageButton3Frg1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, viewGroup, false);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {

                Fragment fragment = null;
                if(view == view.findViewById(R.id.img_btn1fr_1))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {
                    if(savedInstanceState!=null)
                        fragment = new FragmentFour();
                    else
                        fragment = new FragmentTwo();

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data", "VEGETERIAN");
                    ed.commit();
                }

                else if(view == view.findViewById(R.id.img_btn2fr_1))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentTwo();

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data", "NON-VEGETERIAN");
                    ed.commit();
                }

                else if(view == view.findViewById(R.id.img_btn3fr_1))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentTwo();

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data", "EGGETERIAN");
                    ed.commit();
                }

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.output, fragment).addToBackStack( "tag" ).commit();
                // transaction.commit();
            }
        };

        imageButton1Frg1 = (ImageButton) view.findViewById(R.id.img_btn1fr_1);
        imageButton2Frg1 = (ImageButton) view.findViewById(R.id.img_btn2fr_1);
        imageButton3Frg1 = (ImageButton) view.findViewById(R.id.img_btn3fr_1);

        imageButton1Frg1.setOnClickListener(listener);
        imageButton2Frg1.setOnClickListener(listener);
        imageButton3Frg1.setOnClickListener(listener);

        TextView output= (TextView)view.findViewById(R.id.msg1);
        output.setText("What kind of diet do you follow?");
        return view;
    }
}