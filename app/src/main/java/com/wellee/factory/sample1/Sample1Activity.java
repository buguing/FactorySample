package com.wellee.factory.sample1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wellee.factory.R;
import com.wellee.factory.SpManager;

/**
 * 无工厂
 */
public class Sample1Activity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mText = findViewById(R.id.text);

        SpManager.getInstance().save("name", "wellee").save("age", "27").commit();
    }

    public void click(View view) {
        String name = SpManager.getInstance().getString("name", "");
        String age = SpManager.getInstance().getString("age", "");
        mText.setText(name + " " + age);
    }
}
