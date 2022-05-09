package com.example.bismanakoriuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSay;
    TextView textSayView;
    EditText editTextSay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSay = findViewById(R.id.btnSay);
        textSayView = findViewById(R.id.textSayView);
        editTextSay = findViewById(R.id.editTexSay);


        btnSay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSayView.setText(editTextSay.getText());
                editTextSay.setText("");
            }
        });
    }
}