package Multithreading;


import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter{
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }

}

class Counter{
    private int balance=500;

    public synchronized void withdraw(int amount){
        if(balance >= amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public int getCount(){
        return balance;
    }
}

public class CounterThread {
    public static void main(String[] args) {
        Counter c = new Counter();
        AtomicCounter a = new AtomicCounter();

        Runnable r = () ->{
            for(int i=0; i<1000; i++){
                a.increment();
            }
        };

        Thread t1 = new Thread(()->{
            c.withdraw(100);
            System.out.println("Balance after " + Thread.currentThread().getName() + " " + c.getCount());
        }, "Thread-1");

        Thread t2 = new Thread(()->{
            c.withdraw(300);
            System.out.println("Balance after " + Thread.currentThread().getName() + " " + c.getCount());
        }, "Thread-2");

        Thread at1 = new Thread(r);
        Thread at2 = new Thread(r);

        at1.start();
        at2.start();

        try{
            at1.join();
            at2.join();
        }
        catch (InterruptedException e){
           throw new RuntimeException("Exception!");
        }

        System.out.println(a.getCount());


    }
}
