package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap extends Thread {
    static HashMap<Integer, String> mp = new HashMap<>();

    public void run(){



    }
    public static void main(String[] args) {
        ConcurrentHashmap c = new ConcurrentHashmap();
        c.start();


        System.out.println("MainThread running");

        mp.put(2,"Sanjana");

        for (Integer key : mp.keySet()) {   // iteration starts
                           // modification during iteration
            System.out.println(key);

            mp.put(1, "Om");
        }

    }
}
