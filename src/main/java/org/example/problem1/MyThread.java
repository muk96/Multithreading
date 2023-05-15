package org.example.problem1;

public class MyThread extends Thread{
    @Override
    public void run(){
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + "  : " + i);
                }
                Thread.sleep(10);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
