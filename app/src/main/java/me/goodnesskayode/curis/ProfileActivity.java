package me.goodnesskayode.curis;

import android.app.ActionBar;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "ProfileActivity";
    public EditText _name;
    public EditText _hospital;
    public EditText _hospitalAddress;
    public EditText _mobileNumber;
    public EditText _nextOfKin;
    public EditText _nextOfKinMobileNumber;
    public EditText _workAddress;
    public Button _save;

    FirebaseUser authUser = FirebaseAuth.getInstance().getCurrentUser();
    private FirebaseDatabase userDb;
    private DatabaseReference userRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        userDb= FirebaseDatabase.getInstance();
        userRef= userDb.getReference("users");

        _name=(EditText) findViewById(R.id.input_name);
        _hospital=(EditText) findViewById(R.id.input_preferred_hospital);
        _hospitalAddress=(EditText) findViewById(R.id.input_preferred_hospital_address);
        _mobileNumber=(EditText) findViewById(R.id.input_mobile_number);
        _nextOfKin=(EditText) findViewById(R.id.input_next_of_kin);
        _nextOfKinMobileNumber=(EditText) findViewById(R.id.input_next_of_kin_mobile_number);
        _workAddress=(EditText) findViewById(R.id.input_work_address);

        _save= (Button) findViewById(R.id.btn_update);
        _save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUserDetails();
            }
        });

        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                // Get Post object and use the values to update the UI
                for (DataSnapshot userSnapshot : snapshot.getChildren()) {
                    //Getting the data from snapshot
                    Userdetails user = userSnapshot.getValue(Userdetails.class);
                    String name = user.getName();
                    String hospital= user.getHospital();
                    String hospitalAddress = user.getHospitalAddress();
                    String mobileNumber = user.getMobileNumber();
                    String nextOfKin= user.getNextOfKin();
                    String nextOfkinMobileNumber = user.getNextOfKinMobileNumber();
                    String workAddress = user.getWorkAddress();
                    _name.setText(name);
                    _hospital.setText(hospital);
                    _hospitalAddress.setText(hospitalAddress);
                    _mobileNumber.setText(mobileNumber);
                    _nextOfKin.setText(nextOfKin);
                    _nextOfKinMobileNumber.setText(nextOfkinMobileNumber);
                    _workAddress.setText(workAddress);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        userRef.addValueEventListener(postListener);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public boolean getUserDetails()
    {
        String name= _name.getText().toString();
        String hospital= _hospital.getText().toString();
        String hospitalAddress= _hospitalAddress.getText().toString();
        String mobileNumber= _mobileNumber.getText().toString();
        String nextOfKin= _nextOfKin.getText().toString();
        String nextOfKinMobileNumber= _nextOfKinMobileNumber.getText().toString();
        String workAddress= _workAddress.getText().toString();

        if (authUser != null) {
            // User is signed in
            String uid = authUser.getUid();
            String email = authUser.getEmail();
            String getName= name;
            String getHospital= hospital;
            String getHospitalAddress= hospitalAddress;
            String getMobileNumber= mobileNumber;
            String getNextOfKin= nextOfKin;
            String getNextOfKinMobileNumber= nextOfKinMobileNumber;
            String getWorkAddress= workAddress;
            int getStatus=1;

            Userdetails user = new Userdetails(uid,getName,email,getMobileNumber,
                                getHospital,getHospitalAddress,getNextOfKin,
                                getNextOfKinMobileNumber,getWorkAddress,getStatus);

//            String key= userRef.child("users").getKey();
//            String key= "-Kpzt4xB5OtX6eq4EOYA";

            userRef.child(uid).setValue(user);

            Toast.makeText(ProfileActivity.this,"Profile set in DB",Toast.LENGTH_LONG).show();
        } else {
            // No user is signed in
        }

        return true;
    }


}
