package Java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface DefaultStatic{
    void show();

    default void dMethod(){
        System.out.println("D Method");
    };

    static void sMethod(){
        System.out.println("S Method");
    }
}

public class MainClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();

        Iterator<Integer> iterator = myList.iterator();

        for(int i=0; i<10; i++) myList.add(i);


        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println("Iterator is "+ i);
        }

        myList.forEach((val) -> System.out.println("Val is " + val));
    }
}
