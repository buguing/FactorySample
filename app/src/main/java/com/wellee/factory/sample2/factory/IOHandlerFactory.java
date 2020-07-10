package com.wellee.factory.sample2.factory;

import com.wellee.factory.sample2.handler.impl.DiskIOHandler;
import com.wellee.factory.sample2.handler.impl.MemoryIOHandler;
import com.wellee.factory.sample2.handler.impl.SpIOHandler;
import com.wellee.factory.sample2.handler.IOHandler;

/**
 * 简单工厂
 */
public class IOHandlerFactory {

    public enum IOType {
        MEMORY, SP, DISK
    }

    public static IOHandler createIOHandler(IOType type) {
        switch (type) {
            case MEMORY:
                return new MemoryIOHandler();
            case SP:
                return new SpIOHandler();
            case DISK:
                return new DiskIOHandler();
            default:
                return null;
        }
    }
}
