package org.example.problem3;

public class CountJob implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("Count : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
