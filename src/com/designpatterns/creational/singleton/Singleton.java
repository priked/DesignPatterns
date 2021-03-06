package com.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton () {

    }

    // Double-Checked Locking.
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}