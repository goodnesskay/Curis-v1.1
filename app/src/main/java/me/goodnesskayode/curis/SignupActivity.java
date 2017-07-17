package me.goodnesskayode.curis;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
//
//import butterknife.ButterKnife;
//import butterknife.InjectView;

public class SignupActivity extends AppCompatActivity {
//    private static final String TAG = "SignupActivity";
//    private Button userSignup;
//    private Button providerSignup;
//    private FirebaseAuth auth;
//    //    private ProgressBar progressBar;
//    String[] SPINNERLIST = {"Emergency Seeker", "Emergency Provider"};
//
//    @InjectView(R.id.input_name) EditText _nameText;
//    @InjectView(R.id.input_email) EditText _emailText;
//    @InjectView(R.id.input_password) EditText _passwordText;
//    @InjectView(R.id.android_material_design_spinner) MaterialBetterSpinner _role;
//    @InjectView(R.id.btn_signup) Button _signupButton;
//    @InjectView(R.id.link_login) TextView _loginLink;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signup);
//        ButterKnife.inject(this);
//
//        auth= FirebaseAuth.getInstance();
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
//        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
//                findViewById(R.id.android_material_design_spinner);
//        materialDesignSpinner.setAdapter(arrayAdapter);
//
//        _signupButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signup();
//            }
//        });
//
//        _loginLink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent login = new Intent(getApplicationContext(),LoginActivity.class);
//                startActivity(login);
//                finish();
//            }
//        });
//    }
//
//    public void signup() {
//        Log.d(TAG, "Signup");
//
//        if (!validate()) {
//            onSignupFailed();
//            return;
//        }
//
//        _signupButton.setEnabled(false);
////        progressBar = (ProgressBar) findViewById(R.id.progressBar);
////        String name = _nameText.getText().toString();
//        String email = _emailText.getText().toString();
//        String password = _passwordText.getText().toString();
////        String role = _role.getText().toString();
//
////        progressBar.setVisibility(View.VISIBLE);
//
//        // TODO: Implement your own signup logic here.
//        auth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Toast.makeText(SignupActivity.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
//                        //setUserSignup();
////                        progressBar.setVisibility(View.GONE);
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Toast.makeText(SignupActivity.this, "Authentication failed." + task.getException(),
//                                    Toast.LENGTH_SHORT).show();
//                        } else {
//                            startActivity(new Intent(SignupActivity.this, MainActivity.class));
//                            finish();
//                        }
//                    }
//                });
//
//    }
//
//    public void onSignupFailed() {
//        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
//        _signupButton.setEnabled(true);
//    }
//
//    public boolean validate() {
//        boolean valid = true;
//
//        String name = _nameText.getText().toString();
//        String email = _emailText.getText().toString();
//        String password = _passwordText.getText().toString();
//
//        if (name.isEmpty() || name.length() < 3) {
//            _nameText.setError("at least 3 characters");
//            valid = false;
//        } else {
//            _nameText.setError(null);
//        }
//
//        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//            _emailText.setError("enter a valid email address");
//            valid = false;
//        } else {
//            _emailText.setError(null);
//        }
//
//        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
//            _passwordText.setError("between 4 and 10 alphanumeric characters");
//            valid = false;
//        } else {
//            _passwordText.setError(null);
//        }
//        return valid;
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
////        progressBar.setVisibility(View.GONE);
//    }
//
//    public void setUserSignup()
//    {
//        userSignup = (Button) findViewById(R.id.btn_signup);
//        userSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent user = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(user);
//                finish();
//            }
//        });
//    }

}