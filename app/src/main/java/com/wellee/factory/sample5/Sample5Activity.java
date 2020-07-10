package com.wellee.factory.sample5;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wellee.factory.R;
import com.wellee.factory.sample5.factory.IOHandlerFactory;
import com.wellee.factory.sample5.handler.IOHandler;

/**
 * 单例抽象工厂
 */
public class Sample5Activity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        mText = findViewById(R.id.text);

        IOHandler ioHandler = IOHandlerFactory.getInstance().getSpIOHandler();
        ioHandler.save("name", "ManBa out");
    }

    public void click(View view) {
        IOHandler ioHandler = IOHandlerFactory.getInstance().getSpIOHandler();
        String name = ioHandler.getString("name");
        mText.setText(name);
    }
}
