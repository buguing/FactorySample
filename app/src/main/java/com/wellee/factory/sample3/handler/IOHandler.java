package com.wellee.factory.sample3.handler;

public interface IOHandler {

    void save(String key, String value);
    void save(String key, int value);
    void save(String key, boolean value);
    void save(String key, double value);
    void save(String key, float value);
    void save(String key, long value);
    void save(String key, byte value);
    void save(String key, Object value);

    String getString(String key);
    int getInt(String key, int defaultValue);
    boolean getBoolean(String key, boolean defaultValue);
    double getDouble(String key, double defaultValue);
    float getFloat(String key, float defaultValue);
    long getLong(String key, long defaultValue);
    byte getByte(String key, byte defaultValue);
    Object getObject(String key, Object defaultValue);

}
