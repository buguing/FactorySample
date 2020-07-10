package com.wellee.factory.sample4.factory;

import com.wellee.factory.sample4.handler.IOHandler;
import com.wellee.factory.sample4.handler.impl.DiskIOHandler;
import com.wellee.factory.sample4.handler.impl.MemoryIOHandler;
import com.wellee.factory.sample4.handler.impl.SpIOHandler;

/**
 * 抽象工厂
 */
public class IOHandlerFactory {

    public static IOHandler createIOHandler(Class<? extends IOHandler> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new SpIOHandler();
    }

    public static IOHandler getMemoryIOHandler() {
        return createIOHandler(MemoryIOHandler.class);
    }

    public static IOHandler getSpIOHandler() {
        return createIOHandler(SpIOHandler.class);
    }

    public static IOHandler getDiskIOHandler() {
        return createIOHandler(DiskIOHandler.class);
    }

    public static IOHandler getDefaultIOHandler() {
        return getSpIOHandler();
    }
}
