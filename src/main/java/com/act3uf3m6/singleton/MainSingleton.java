package com.act3uf3m6.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("s1 i s2 són la mateixa instància.");
            System.out.println("s1 UUID: " + s1.getUuid());
            System.out.println("s2 UUID: " + s2.getUuid());
        } else {
            System.out.println("s1 i s2 són instàncies diferents.");
        }
    }
}