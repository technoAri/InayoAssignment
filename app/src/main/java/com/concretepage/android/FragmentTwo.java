package com.concretepage.android;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.cp.android.R;

public class FragmentTwo extends Fragment {
    ImageButton imagebutton2Frag2;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, viewGroup, false);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view1) {

                Fragment fragment = null;
                if(view1 == view1.findViewById(R.id.img_btn1fr_2))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentThree();


                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data1", "LIGHT");
                    ed.commit();
                }

                else if(view1 == view1.findViewById(R.id.img_btn2fr_2))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentThree();


                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data1", "MODERATE");
                    ed.commit();
                }

                else if(view1 == view1.findViewById(R.id.img_btn3fr_2))// || view == findViewById(R.id.img_btn2fr_1)) || view == findViewById(R.id.img_btn3fr_1)){
                {  fragment = new FragmentThree();


                    //SharedPreferences settings = getSharedPreferences("PREFS_NAME", MODE_PRIVATE);

                    SharedPreferences prefs = getActivity().getSharedPreferences("TOT", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = prefs.edit();
                    ed.putString("data1", "HEAVY");
                    ed.commit();
                }

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.output, fragment).addToBackStack( "tag" ).commit();
               // transaction.commit();
            }



            };

        ImageButton imagebutton1Frag2 = (ImageButton) view.findViewById(R.id.img_btn1fr_2);
        imagebutton2Frag2 = (ImageButton) view.findViewById(R.id.img_btn2fr_2);
        ImageButton imagebutton3Frag2 = (ImageButton) view.findViewById(R.id.img_btn3fr_2);

        imagebutton1Frag2.setOnClickListener(listener);
        imagebutton2Frag2.setOnClickListener(listener);
        imagebutton3Frag2.setOnClickListener(listener);

        TextView output= (TextView)view.findViewById(R.id.msg2);
        output.setText("How do you sleep at night?");
        return view;
    }
}
