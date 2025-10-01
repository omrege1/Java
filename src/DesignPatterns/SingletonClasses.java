package DesignPatterns;

import java.util.logging.Logger;

import java.lang.reflect.Constructor;

class EagerInitializedSingleton{

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){};

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}

class StaticBlockSingleton{
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){};

    //static block initialization for exception handling;
    static {
        try{
            instance = new StaticBlockSingleton();
        }
        catch (Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}

class LazyInitializedSingleton{
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){};

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

class ThreadSafeSingleton{
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){};

    public static synchronized ThreadSafeSingleton getInstance(){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        return instance;
    }
}

class CloneableSingleton implements Cloneable{
    private static CloneableSingleton instance;

    private CloneableSingleton(){};

    protected static CloneableSingleton getInstance(){
        if(instance == null){
            instance = new CloneableSingleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}

public class SingletonClasses {
    public static void main(String[] args) throws CloneNotSupportedException {
        EagerInitializedSingleton instance1  = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = null;
        CloneableSingleton a = CloneableSingleton.getInstance();
        CloneableSingleton cloneableSingleton = (CloneableSingleton) a.clone();

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor: constructors){
                //This code will destroy singleton pattern
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("P " + a.hashCode());
        System.out.println(cloneableSingleton.hashCode());
    }
}


