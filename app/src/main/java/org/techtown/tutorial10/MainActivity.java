package org.techtown.tutorial10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwpordText = (EditText) findViewById(R.id.passwordText);
        TextView welcomeMassage = (TextView) findViewById(R.id.welcomeMessage);
    }
}
