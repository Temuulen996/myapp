package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button count;
    private Button zero;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        count = (Button) findViewById(R.id.count);
        zero = (Button) findViewById(R.id.zero);
    }
    public void showToast(View view) {
        Log.d("MainActivity", "Hello World");
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
        mCount++;
        if(mCount !=0 ){
            zero.setBackgroundColor(Color.parseColor("#7bb55c"));
        }
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));

        }
    }
    public void zero(View view){
        mCount = 0;
        view.setBackgroundColor(Color.parseColor("#7f857b"));
        mShowCount.setText(Integer.toString(mCount));

    }
}