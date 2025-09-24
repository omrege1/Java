package Multithreading;

class Brackets1{
    synchronized public void printBrackets(char open, char close){
        synchronized (this) {
            for(int i=0; i<10; i++){
                if(i < 5){
                    System.out.print(open);
                }
                else{
                    System.out.print(close);
                }
            }
        }
    }
}

public class SyncMethod {
    public static void main(String[] args) throws Exception {
        Brackets1 brackets = new Brackets1();
        Thread thread1 = new Thread( new Runnable(){
            public void run(){
                for(int i=0; i<5; i++){
                    brackets.printBrackets('[',']');
                    System.out.println();
                }
            }
        });

        Thread thread2 = new Thread( new Runnable(){
            public void run(){
                for(int i=0; i<5; i++){
                    brackets.printBrackets('{','}');
                    System.out.println();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
