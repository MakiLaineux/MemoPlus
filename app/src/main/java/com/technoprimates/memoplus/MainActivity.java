package com.technoprimates.memoplus;

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

     public void showData(View view) {
        EditText codeText = findViewById(R.id.numCode);
         TextView textView = findViewById(R.id.textView);
         if (codeText.getText().toString().equals("5689")) {
             textView.setText("8582");
         } else {
             textView.setText("");
         }
         codeText.setText("");     }
}