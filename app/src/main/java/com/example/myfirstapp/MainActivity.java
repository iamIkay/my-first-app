package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        EditText fName = findViewById(R.id.edtFirstName);
        EditText lName = findViewById(R.id.edtLastName);
        EditText edtEmail = findViewById(R.id.edtEmail);
        TextView disFname = findViewById(R.id.disFirstName);
        TextView disLname = findViewById(R.id.disLastName);
        TextView disEmail = findViewById(R.id.disEmail);


        disFname.append(fName.getText().toString());
        disLname.append(lName.getText().toString());
        disEmail.append(edtEmail.getText().toString());
        fName.setText("");
        lName.setText("");
        edtEmail.setText("");

    }
}