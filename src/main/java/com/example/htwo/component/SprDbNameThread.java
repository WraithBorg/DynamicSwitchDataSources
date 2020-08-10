package com.example.htwo.component;

/**
 * 记录当前数据源类型
 */
public class SprDbNameThread {
    private static ThreadLocal<String> dataType = new ThreadLocal<>();

    public static void set(String name) {
        dataType.set(name);
    }

    public static String get() {
        return dataType.get();
    }
}
