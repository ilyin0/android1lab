package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);
        int sourceNumber = intent.getIntExtra("sourceNumber", 0);
        TextView textView = (TextView) findViewById(R.id.textView2);
        int sum = number + sourceNumber;
        textView.setText(String.valueOf(sum));
    }

    public void putText(View view) {
        Intent intent = new Intent(this, form2.class);
        EditText editText = (EditText) findViewById(R.id.input);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String stringNumber = editText.getText().toString();
        int number = stringNumber.isEmpty() ? 0 : Integer.parseInt(stringNumber);
        String stringSourceNumber = textView.getText().toString();
        int sourceNumber = stringSourceNumber.isEmpty() ? 0 : Integer.parseInt(stringSourceNumber);
        intent.putExtra("number", number);
        intent.putExtra("sourceNumber", sourceNumber);
        startActivity(intent);
    }

}