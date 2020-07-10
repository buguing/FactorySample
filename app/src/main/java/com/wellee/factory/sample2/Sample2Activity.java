package com.wellee.factory.sample2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wellee.factory.R;
import com.wellee.factory.sample2.factory.IOHandlerFactory;
import com.wellee.factory.sample2.handler.IOHandler;

/**
 * 简单工厂
 */
public class Sample2Activity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mText = findViewById(R.id.text);

        IOHandler ioHandler = IOHandlerFactory.createIOHandler(IOHandlerFactory.IOType.SP);
        assert ioHandler != null;
        ioHandler.save("name", "Dwyane Wade");
    }

    public void click(View view) {
        IOHandler ioHandler = IOHandlerFactory.createIOHandler(IOHandlerFactory.IOType.SP);
        assert ioHandler != null;
        String name = ioHandler.getString("name");
        mText.setText(name);
    }
}
