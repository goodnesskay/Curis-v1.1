package me.goodnesskayode.curis;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PendingFragment extends Fragment {

    public PendingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_pending, container, false);
        Button accept=(Button) rootView.findViewById(R.id.accept_trip);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accept = new Intent(getActivity(),SingleRequestActivity.class);
                startActivity(accept);
            }
        });
        return rootView;
    }


}
