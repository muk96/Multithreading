package org.example.problem5;

import java.util.concurrent.Semaphore;

public class Problem5 {
    int no_of_threads;
    Semaphore semaphore;

    int shared_resource;

    public Problem5(int num){
        no_of_threads = num;
        semaphore = new Semaphore((no_of_threads));
        shared_resource = 5;
    }

    public void accessSharedResource() {
        try {
            semaphore.acquire();

            System.out.println("Thread " + Thread.currentThread().getName() + "is accessing the current thread.");
            shared_resource += 2;
            Thread.sleep(10);

            semaphore.release();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String... args) {
        Problem5 problem5 = new Problem5(10);
        for(int i=0; i<10; i++){
            Thread thread = new Thread(()->{
                problem5.accessSharedResource();
            });
            thread.start();
        }
    }

}
