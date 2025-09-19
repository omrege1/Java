package Multithreading;

class A extends Thread{
    public void run(){
        System.out.println("Thread A running");
    }
}

class B implements Runnable{
    public void run(){
        for (int i = 5; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ,i " + i);
        }
    }
}

public class Multithreading {
    public static void main(String args[]){
        B temp = new B();
        Thread1 t1 = new Thread1();
//        t1.setName("Om");
        Thread t2 = new Thread(temp);
        t1.start();
        t2.start();

        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" ,i " + i);
        }

    }
}
