package org.example.problem2;

public class Depositer implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            Bank.getBank().deposit(100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
