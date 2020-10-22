package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class form2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);
        int sourceNumber = intent.getIntExtra("sourceNumber", 0);
        TextView textView = (TextView) findViewById(R.id.textView3);
        int sum = number + sourceNumber;
        textView.setText(String.valueOf(sum));
    }

    public void putText(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView3);
        int sourceNumber = Integer.parseInt(textView.getText().toString());
        int number = Integer.parseInt(editText.getText().toString());
        intent.putExtra("number", number);
        intent.putExtra("sourceNumber", sourceNumber);
        startActivity(intent);
    }
}