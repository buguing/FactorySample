package com.wellee.factory.sample3.factory.impl;

import com.wellee.factory.sample3.factory.IOFactory;
import com.wellee.factory.sample3.handler.impl.MemoryIOHandler;
import com.wellee.factory.sample3.handler.IOHandler;

public class MemoryIOFactory implements IOFactory {

    @Override
    public IOHandler createIOHandler() {
        return new MemoryIOHandler();
    }
}
