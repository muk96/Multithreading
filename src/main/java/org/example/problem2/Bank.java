package org.example.problem2;

//A Singleton Bank class
public class Bank {
    private static final Bank bank = new Bank(0);

    public static int bankBalance = 0;

    private Bank(int bankBalance){
        Bank.bankBalance = bankBalance;
    }

    public void deposit(int amount){
        synchronized(this) {
            bankBalance += amount;
        }
        System.out.println("Deposited : " + amount + ", Bank's Balance : " + bankBalance);
    }

    public void withdrawal(int amount){
        if(bankBalance < amount){
            System.out.println("Insufficient balance!");
            return;
        }
        synchronized (this) {
            bankBalance -= amount;
        }
        System.out.println("Withdrawn : " + amount + ", Bank's Balance : " + bankBalance);
    }

    public static Bank getBank(){
        return bank;
    }

}
