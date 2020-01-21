package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

  //  private static final String TAG = "MainActivity";

  private  EditText name;
   private EditText pass;
    Button login;
    TextView  signup;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /*  Log.i(TAG,"--on create--");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"--on start--");

    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG,"--on restart--");

    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"--on resume--");

    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG,"--on pause--");

    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG,"--on stop--");*/


        name=( EditText)findViewById(R.id.editText);
        pass=( EditText)findViewById(R.id.editText2);
login=(Button)findViewById(R.id.button3);
login.setOnClickListener(new View.OnClickListener(){

    public void onClick(View view){
        validate(name.getText().toString(),pass.getText().toString());
    }
});
    }
    private void validate(String userName, String password)
    {
        if((userName.contentEquals("aarvi")) && (password.contentEquals("9554480860")))
        {
Intent intent= new Intent(MainActivity.this,secondActivity.class);
startActivity(intent);
        }
        else
        {
            Context context=getApplicationContext();
            int duration=Toast.LENGTH_SHORT;
            Toast toast= Toast.makeText(context,"login credentials wrong plzz enter correct credentials",duration);
            toast.show();
        }
    }


}
