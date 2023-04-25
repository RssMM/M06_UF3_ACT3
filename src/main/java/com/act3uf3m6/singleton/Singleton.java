package com.act3uf3m6.singleton;

import java.util.UUID;

public class Singleton {
    private static Singleton instance = null;
    private static Object mutex = new Object();
    private UUID uuid;

    private Singleton() {
        uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (mutex) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}