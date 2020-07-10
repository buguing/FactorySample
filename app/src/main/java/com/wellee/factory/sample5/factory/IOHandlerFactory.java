package com.wellee.factory.sample5.factory;

import com.wellee.factory.sample5.handler.IOHandler;
import com.wellee.factory.sample5.handler.impl.DiskIOHandler;
import com.wellee.factory.sample5.handler.impl.MemoryIOHandler;
import com.wellee.factory.sample5.handler.impl.SpIOHandler;

/**
 * 抽象工厂
 */
public class IOHandlerFactory implements IOFactory{

    private IOHandler mMemoryIOHandler, mSpIOHandler, mDiskIOHandler;

    private static volatile IOHandlerFactory INSTANCE;

    private IOHandlerFactory() {}

    public static IOHandlerFactory getInstance() {
        if (INSTANCE == null) {
            synchronized (IOHandlerFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new IOHandlerFactory();
                }
            }
        }
        return INSTANCE;
    }


    public IOHandler getMemoryIOHandler() {
        if (mMemoryIOHandler == null) {
            mMemoryIOHandler = createIOHandler(MemoryIOHandler.class);
        }
        return mMemoryIOHandler;
    }

    public IOHandler getSpIOHandler() {
        if (mSpIOHandler == null) {
            mSpIOHandler = createIOHandler(SpIOHandler.class);
        }
        return mSpIOHandler;
    }

    public IOHandler getDiskIOHandler() {
        if (mDiskIOHandler == null) {
            mDiskIOHandler = createIOHandler(DiskIOHandler.class);
        }
        return mDiskIOHandler;
    }

    public IOHandler getDefaultIOHandler() {
        return getSpIOHandler();
    }

    @Override
    public IOHandler createIOHandler(Class<? extends IOHandler> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getDefaultIOHandler();
    }
}
