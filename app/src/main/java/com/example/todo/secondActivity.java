package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Context context=getApplicationContext();
        int duration= Toast.LENGTH_SHORT;
        Toast toast= Toast.makeText(context,"welcome to todo lists..",duration);
        toast.show();
    }
}
