package com.example.mdp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button BTConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTConnection = (Button) findViewById(R.id.BTConnection);
    }
    /*public void openBTSetup(View view) {
        Intent intent = new Intent(MainActivity.this, BluetoothActivity.class);
        startActivity(intent);
    }*/
    public void openBTSetup(View view) {
        Log.d(TAG, "openBTSetup: BT Setup Opened");
        Intent intent = new Intent(MainActivity.this, BluetoothActivity.class);
        startActivity(intent);
    }


}