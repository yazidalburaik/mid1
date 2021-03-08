package com.example.mockmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText name = (EditText) findViewById(R.id.insetName);
        final EditText birth = (EditText) findViewById(R.id.insertBirth);
        final RadioButton male = (RadioButton) findViewById(R.id.radioButtonMale);
        final RadioButton female = (RadioButton) findViewById(R.id.radioButtonFemale);
        final RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        final TextView msg = (TextView) findViewById(R.id.msg);
        final Button a2toa1 = (Button) findViewById(R.id.bttn_2to1);
        final Button a2toa3 = (Button) findViewById(R.id.bttn_2to3);
        final Button submit = (Button) findViewById(R.id.bttn_submit);

        a2toa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent s2tos1 = new Intent(Activity2.this, MainActivity.class);
            startActivity(s2tos1);
            }
        });


        a2toa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2tos3 = new Intent(Activity2.this,Activity3.class);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( name != null&& birth !=null){
                    if(male.isChecked()){
                        msg.setText("Hello Mr." + name.getText() + " you are " + (2021 - Integer.parseInt(birth.getText().toString())) + " years old");
                    }
                    if(female.isChecked()){
                        msg.setText("Hello Miss." + name.getText() + " you are " + (2021 - Integer.parseInt(birth.getText().toString())) + " years old");
                    }

                    else{
                        Toast.makeText(Activity2.this, "Please Enter All Info", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });



    }
}