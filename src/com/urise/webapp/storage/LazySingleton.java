package com.urise.webapp.storage;

/**
 * Created by iStyle on 30.08.2020. l
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;

//        if (INSTANCE == null) {
//            synchronized (LazySingleton.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new LazySingleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    private static class LazySingletonHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return LazySingletonHolder.INSTANCE;
    }

    private LazySingleton() {
    }
}
