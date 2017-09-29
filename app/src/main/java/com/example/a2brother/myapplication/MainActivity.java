package com.example.a2brother.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private Button resetButton;
    private EditText etName;
    private TextView tvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.buttonDisplay);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);
    }

    public void displayText (View view){

        String text = etName.getText().toString();
        tvMessage.setText("Welcome " + text);
    }

    public void resetText (View view){

        etName.getText().clear();
        Toast toast = Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT);
        toast.show();

    }
}
