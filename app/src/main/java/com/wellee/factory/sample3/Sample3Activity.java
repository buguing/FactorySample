package com.wellee.factory.sample3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wellee.factory.R;
import com.wellee.factory.sample3.factory.IOFactory;
import com.wellee.factory.sample3.factory.impl.SpIOFactory;
import com.wellee.factory.sample3.handler.IOHandler;

/**
 * 工厂方法模式
 */
public class Sample3Activity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mText = findViewById(R.id.text);

        IOFactory ioFactory = new SpIOFactory();
        IOHandler ioHandler = ioFactory.createIOHandler();
        ioHandler.save("name", "LeBron James");
    }

    public void click(View view) {
        IOFactory ioFactory = new SpIOFactory();
        IOHandler ioHandler = ioFactory.createIOHandler();
        String name = ioHandler.getString("name");
        mText.setText(name);
    }
}
