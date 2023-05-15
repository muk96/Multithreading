package org.example.problem3;

public class MultiplyJob implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("2 * " + i + " : " + 2*i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
