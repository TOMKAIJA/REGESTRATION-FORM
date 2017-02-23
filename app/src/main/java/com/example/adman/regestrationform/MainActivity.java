package com.example.adman.regestrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button b;
 EditText pw,us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pw=(EditText)findViewById(R.id.password);
        us=(EditText) findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
    }

    public void login(View view){
        String name=us.getText().toString();
        Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
    }
}
