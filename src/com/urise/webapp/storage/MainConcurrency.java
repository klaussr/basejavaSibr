package com.urise.webapp.storage;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by iStyle on 27.08.2020. l
 */
public class MainConcurrency {
    private static volatile int counter;
    private static final Object LOCK = new Object();
    private static final int THREADS_NUMBER = 10000;
    private static final Lock lock = new ReentrantLock();
    private final AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread thread0 = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "," + getState());
   //             throw new IllegalStateException();
            }
        };
        thread0.start();

        final MainConcurrency mainConcurrency = new MainConcurrency();
        CountDownLatch latch = new CountDownLatch(THREADS_NUMBER);
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "," + Thread.currentThread().getState())).start();
        System.out.println(thread0.getState());

        for (int i = 0; i < THREADS_NUMBER; i++) {
            Future<Integer> future = executorService.submit(() ->
           // Thread thread = new Thread(() ->
            {
                for (int j = 0; j < 100; j++) {
                    mainConcurrency.inc();
                }
                latch.countDown();
                return 5;
            });
         //   thread.start();
        }
         latch.await(10, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println(mainConcurrency.atomicInteger.get());
    }

    private void inc() {
//        lock.lock();
//        try {
//            counter++;
//        }
//        finally {
//            lock.unlock();
//        }
        atomicInteger.incrementAndGet();

    }

}



