package com.wellee.factory.sample5.factory;

import com.wellee.factory.sample5.handler.IOHandler;

public interface IOFactory {

    IOHandler createIOHandler(Class<? extends IOHandler> clazz);
}
