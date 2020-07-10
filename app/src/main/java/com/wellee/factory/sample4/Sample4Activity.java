package com.wellee.factory.sample4;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wellee.factory.R;
import com.wellee.factory.sample4.factory.IOHandlerFactory;
import com.wellee.factory.sample4.handler.IOHandler;

/**
 * 抽象工厂
 */
public class Sample4Activity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mText = findViewById(R.id.text);

        IOHandler ioHandler = IOHandlerFactory.getSpIOHandler();
        ioHandler.save("name", "Cris Bosh");
    }

    public void click(View view) {
        IOHandler ioHandler = IOHandlerFactory.getSpIOHandler();
        String name = ioHandler.getString("name");
        mText.setText(name);
    }
}
