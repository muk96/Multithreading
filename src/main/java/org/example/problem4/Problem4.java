package org.example.problem4;

import java.util.concurrent.CountDownLatch;

public class Problem4 {
   public static void main(String... args) throws InterruptedException {
       int numThreads=5;
       CountDownLatch countDownLatch = new CountDownLatch(numThreads); //No. of threads I need to wait on
       for(int i=0; i<numThreads; i++){
           Thread thread = new Thread(() -> {
               System.out.println("Thread : " + Thread.currentThread().getName());
               countDownLatch.countDown();
           });
           thread.start();
       }

       countDownLatch.await();
       System.out.println("All the other threads have completed! We're in main thread now.");

       System.out.println("Thread : " + Thread.currentThread().getName());
   }
}
