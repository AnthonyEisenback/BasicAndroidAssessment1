package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public Button button;
    public EditText editText;
    public Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_submit);
        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.edit_text);
        nextButton = findViewById(R.id.next_button);
        click();
    }

    protected void click() {
        final Intent intent = new Intent(this , NameActivity.class);

        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                EditText edit = findViewById(R.id.edit_text);
                TextView tview = findViewById(R.id.text_view);
                String result = edit.getText().toString();
                tview.setText(result);
                editText.setText("");
                Toast.makeText(MainActivity.this, "Android is Fun!", Toast.LENGTH_SHORT).show();


            }
        });

        nextButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                startActivity(intent);

            }
        });


    }

}
