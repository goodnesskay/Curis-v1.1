package me.goodnesskayode.curis;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import me.goodnesskayode.curis.models.Request;


public class DoneFragment extends Fragment {

    FirebaseDatabase database;
    DatabaseReference myRef;
    List<Request> list;
    RecyclerView recyclerview;

    private TextView _name;
    private TextView _address;
    private TextView _destination;
    private TextView _patients;

    public DoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_done, container, false);
        _name= (TextView) rootView.findViewById(R.id.name);
        _address= (TextView) rootView.findViewById(R.id.address);
        _destination= (TextView) rootView.findViewById(R.id.destination);
        _patients= (TextView) rootView.findViewById(R.id.patients);


        recyclerview = (RecyclerView) rootView.findViewById(R.id.rview);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("requests");
        Query presentData = myRef.orderByChild("requestCreatorUid").equalTo("13344566666656");
        presentData.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                // StringBuffer stringbuffer = new StringBuffer();
                for(DataSnapshot dataSnapshot1 :dataSnapshot.getChildren()){

                    Request requests= dataSnapshot1.getValue(Request.class);
                    Request request = new Request();
                    String creatorName=requests.getRequestCreatorName();
                    String creatorAddress=requests.getRequestCreatorAddress();
                    String patients=requests.getNumberOfPatients();
                    Double creatorDestination=requests.getRequestCreatorDestination();
                    // Toast.makeText(MainActivity.this,""+name,Toast.LENGTH_LONG).show();
                    request.setRequestCreatorName(creatorName);
                    request.setRequestCreatorAddress(creatorAddress);
                    request.setRequestCreatorDestination(creatorDestination);
                    request.setNumberOfPatients(patients);
                    list.add(request);
                }

                RecyclerviewAdapter recycler = new RecyclerviewAdapter(list);
                RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(getActivity());
                recyclerview.setLayoutManager(layoutmanager);
                recyclerview.setItemAnimator( new DefaultItemAnimator());
                recyclerview.setAdapter(recycler);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //  Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        return rootView;
    }


}
