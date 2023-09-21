package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        Log.i("INFO", "Button Pressed");
        EditText myTextField =(EditText) findViewById(R.id.myTextField);
        //Toast.makeText(MainActivity.this,myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(myTextField.getText().toString());
    }

    private void goToActivity(String s) {
        Intent intent=new Intent(this,CalculatorActivity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}