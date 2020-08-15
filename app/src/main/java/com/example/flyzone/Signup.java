package com.example.flyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {
    EditText uname,uemail,uphone,upassword;
    Button usignup ,ulogin;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        uname = findViewById(R.id.name);
        uemail= findViewById(R.id.email);

        uphone = findViewById(R.id.phone);
        upassword = findViewById(R.id.password);
        usignup = findViewById(R.id.signup);
        ulogin = findViewById(R.id.login);
        ulogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Signup.this,Login.class);
                startActivity(n);
            }
        });
        usignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Signup");


                String tname = uname.getText().toString();
                String temail = uemail.getText().toString();
                String tphone = uphone.getText().toString();
                String tpassword = upassword.getText().toString();


                UserHelper helper = new UserHelper(tname,temail,tphone,tpassword);
                reference.child(tphone).setValue(helper);



            }
        });
    }
}