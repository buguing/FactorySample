package com.wellee.factory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wellee.factory.sample1.Sample1Activity;
import com.wellee.factory.sample2.Sample2Activity;
import com.wellee.factory.sample3.Sample3Activity;
import com.wellee.factory.sample4.Sample4Activity;
import com.wellee.factory.sample5.Sample5Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample1(View view) {
        startActivity(new Intent(this, Sample1Activity.class));
    }

    public void sample2(View view) {
        startActivity(new Intent(this, Sample2Activity.class));
    }

    public void sample3(View view) {
        startActivity(new Intent(this, Sample3Activity.class));
    }

    public void sample4(View view) {
        startActivity(new Intent(this, Sample4Activity.class));
    }

    public void sample5(View view) {
        startActivity(new Intent(this, Sample5Activity.class));
    }
}
