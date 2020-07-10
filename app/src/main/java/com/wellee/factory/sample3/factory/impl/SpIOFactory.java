package com.wellee.factory.sample3.factory.impl;

import com.wellee.factory.sample3.factory.IOFactory;
import com.wellee.factory.sample3.handler.impl.SpIOHandler;
import com.wellee.factory.sample3.handler.IOHandler;

public class SpIOFactory implements IOFactory {

    @Override
    public IOHandler createIOHandler() {
        return new SpIOHandler();
    }
}
