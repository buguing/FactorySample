package com.wellee.factory.sample4.handler.impl;

import com.wellee.factory.SpManager;
import com.wellee.factory.sample4.handler.IOHandler;

public class SpIOHandler implements IOHandler {
    @Override
    public void save(String key, String value) {
        SpManager.getInstance().save(key, value).commit();
    }

    @Override
    public void save(String key, int value) {

    }

    @Override
    public void save(String key, boolean value) {

    }

    @Override
    public void save(String key, double value) {

    }

    @Override
    public void save(String key, float value) {

    }

    @Override
    public void save(String key, long value) {

    }

    @Override
    public void save(String key, byte value) {

    }

    @Override
    public void save(String key, Object value) {

    }

    @Override
    public String getString(String key) {
        return SpManager.getInstance().getString(key, "");
    }

    @Override
    public int getInt(String key, int defaultValue) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return false;
    }

    @Override
    public double getDouble(String key, double defaultValue) {
        return 0;
    }

    @Override
    public float getFloat(String key, float defaultValue) {
        return 0;
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return 0;
    }

    @Override
    public byte getByte(String key, byte defaultValue) {
        return 0;
    }

    @Override
    public Object getObject(String key, Object defaultValue) {
        return null;
    }
}
