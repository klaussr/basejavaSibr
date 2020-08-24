package com.urise.webapp;

import com.urise.webapp.model.SectionType;

/**
 * Created by iStyle on 17.08.2020.
 */
public class TestSingleton {
    private static TestSingleton instance = new TestSingleton();

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
            return instance;

    }

    private TestSingleton() {
    }

    public static void main(String[] args) {
        TestSingleton.getInstance().toString();
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance.ordinal());
        for (SectionType type : SectionType.values()) {
            System.out.println(type.getTitle() );
        }
    }

    public enum Singleton {
        INSTANCE
    }
}
