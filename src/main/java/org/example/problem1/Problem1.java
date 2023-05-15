package org.example.problem1;

import java.io.Console;
import java.util.logging.Logger;

public class Problem1 {
    private static final Logger LOGGER = Logger.getLogger(Problem1.class.getName());

    public static void main(String[] args) throws InterruptedException{
        LOGGER.info(Thread.currentThread().getName());
        Thread.currentThread().setName("Even Thread");

        MyThread myThread = new MyThread();
        myThread.setName("Odd Thread");
        myThread.start();

        Thread.sleep(10);
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
            Thread.sleep(10);
        }
    }
}
