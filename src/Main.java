import P.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import P.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//generics in java
class A<T>{
    public void k(T a){
        System.out.println("UU " + a);
    }

    static void sFun(){
        System.out.println("Hi Static");
    }
}

@FunctionalInterface
interface ExampleFunctionalInterface<T>{
    T t(T p1, T p2);
}


public class Main {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        void printCond(List<Integer> c, Predicate<Integer> p){
            for(Integer a : c){
                if(p.test(a))
                    System.out.println(a);
            }
        }

        public static void main(String[] args) {
            Main ma = new Main();
            A a = new A();
            List<Integer> al = new ArrayList<>();
            List<Integer> mp = Arrays.asList(10,11,2);
            String[] arr = {"AAA","OM","Archana"};
            final int obj = 11;
            ArrayList<Integer> p= new ArrayList<Integer>();
            ExampleFunctionalInterface<Integer> c = (a1,a2)-> a1+a2;
            int[] nums = {1,3,1,5};
            Integer f = 100;
            al.add(1);
            al.add(2);
            al.add(3);
            Stream.iterate(0,x->x+1).limit(10).forEach(System.out::println);
            Arrays.stream(arr).filter(x->x.startsWith("A")).filter(x->x.endsWith("a")).forEach(System.out::println);
            double avg = Arrays.stream(nums).average().getAsDouble();
            System.out.println("Avg " + avg);
            ma.printCond(al, x->x%2 ==0);
            a.k(100);
            A.sFun();
            Test.sFun();
            Test.a = 100;
            System.out.println("OO" + Test.a);
            System.out.println(c.t(100,2));
            int[] l = {1,3,1};
            List<Integer> k = Arrays.stream(nums).boxed().toList();
            for(Integer lr : k)
                System.out.println("Ji " +lr);
            Arrays.stream(nums).min();
            mp.forEach((o)-> System.out.println("Hi " + (o*o)));
            Arrays.sort(nums);
//            System.out.println("Nums are " + nums);
            for(int pp: nums){
                System.out.println(pp);
            }

            List<Integer> boxedArr = Arrays.stream(nums).boxed().collect(Collectors.toList());
            Collections.sort(boxedArr,(n1,n2) -> (n2-n1));
            System.out.println("Nums are " + boxedArr.get(3));
            Integer[] alArray = new Integer[0];
            alArray = al.toArray(alArray);
            for(Integer x: alArray){
                System.out.println("ToArray " + x);
            }


        }
}
