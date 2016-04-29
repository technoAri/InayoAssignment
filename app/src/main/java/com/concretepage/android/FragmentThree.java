package com.concretepage.android;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.cp.android.R;

/**
 * Created by HP PC on 4/25/2016.
 */
public class FragmentThree extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, viewGroup, false);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view2) {
                android.support.v4.app.Fragment fragment = null;
                if(view2 == view2.findViewById(R.id.img_btn1fr_3))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentFour();



                    //SharedPreferences settings = getSharedPreferences("PREFS_NAME", MODE_PRIVATE);

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data2", "<8 HRS");
                    ed.commit();
                }

                else if(view2 == view2.findViewById(R.id.img_btn2fr_3))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentFour();


                    //SharedPreferences settings = getSharedPreferences("PREFS_NAME", MODE_PRIVATE);

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data2", "8 HRS");
                    ed.commit();
                }

                else if(view2 == view2.findViewById(R.id.img_btn3fr_3))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentFour();




                    //SharedPreferences settings = getSharedPreferences("PREFS_NAME", MODE_PRIVATE);

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data2", ">8 HRS");
                    ed.commit();
                }

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.output, fragment).addToBackStack( "tag" ).commit();;
                // transaction.commit();
            }



        };

        ImageButton imagebutton1Frag3 = (ImageButton) view.findViewById(R.id.img_btn1fr_3);
        ImageButton imagebutton2Frag3 = (ImageButton) view.findViewById(R.id.img_btn2fr_3);
        ImageButton imagebutton3Frag3 = (ImageButton) view.findViewById(R.id.img_btn3fr_3);

        imagebutton1Frag3.setOnClickListener(listener);
        imagebutton2Frag3.setOnClickListener(listener);
        imagebutton3Frag3.setOnClickListener(listener);

        TextView output= (TextView)view.findViewById(R.id.msg3);
        output.setText("How long are you shifts at work?");
        return view;
    }
}
