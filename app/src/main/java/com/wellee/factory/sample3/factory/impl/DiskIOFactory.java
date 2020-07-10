package com.wellee.factory.sample3.factory.impl;

import com.wellee.factory.sample3.factory.IOFactory;
import com.wellee.factory.sample3.handler.impl.DiskIOHandler;
import com.wellee.factory.sample3.handler.IOHandler;

public class DiskIOFactory implements IOFactory {

    @Override
    public IOHandler createIOHandler() {
        return new DiskIOHandler();
    }
}
