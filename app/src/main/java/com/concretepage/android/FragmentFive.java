package com.concretepage.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cp.android.R;

/**
 * Created by HP PC on 4/28/2016.
 */
public class FragmentFive extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_five, viewGroup, false);
//        TextView output= (TextView)view.findViewById(R.id.msg1);
//        output.setText("What kind of diet do you follow?");
        return view;
    }
}
