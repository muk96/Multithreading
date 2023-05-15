package org.example.problem2;

public class Problem2 {
    public static void main(String[] args){
        Bank bank = Bank.getBank();

        //myThread handles deposits
        Runnable r = new Depositer();
        Thread myThread = new Thread(r);
        myThread.start();

        //Main thread handles withdrawals
        for(int i=0; i<5; i++){
            bank.withdrawal(50);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
