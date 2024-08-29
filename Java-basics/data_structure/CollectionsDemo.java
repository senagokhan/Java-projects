package data_structure;

import java.util.*;

public class CollectionsDemo {

        public static void main(String[] args) {
            //setDemo();
            //listDemo();
            queueDemo();
        }

    private static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("orange");
        fruits.add("cherry");
        fruits.add("apple");

        var removed = fruits.remove(); // that will be remove first thing that is in the line
        System.out.println("removed : " + removed);

        System.out.println("Head of queue : " + fruits.peek());

        System.out.println(fruits);
    }

    private static void listDemo() {
            List fruits = new ArrayList();
            fruits.add("apple");
            fruits.add("banana");
            fruits.add("peach");
            fruits.add("orange");

            fruits.set(2, "grape");
            fruits.add("apple");
            fruits.remove("apple"); //removes first found
            fruits.remove(3);
            fruits.add("apple");

        System.out.println("index 2 : " + fruits.get(2));
        System.out.println("index of the grape : " + fruits.indexOf("grape"));
        System.out.println("last index of lemon : " + fruits.lastIndexOf("apple"));

        List moreFruit = List.of("cherry", "plum"); //immutable

        System.out.println(fruits);
        System.out.println(moreFruit);
    }

    public static void setDemo(){

            Set fruits  = new HashSet<>();
            fruits.add("strawberry");
            fruits.add("banana");
            fruits.add("watermelon");
            //fruits.add("banana"); set takes uniques items so the result has 1 banana

            System.out.println(fruits);

            fruits.remove("watermelon");
            System.out.println("contains watermelon? " + fruits.contains("watermelon"));
            System.out.println("size of the set : " + fruits.size());

            Set moreFruit = Set.of("raisin", "pear"); //immutable
            //moreFruit.add("berry") this code will be taken an error
            System.out.println(moreFruit);

        }

}
