package HomeworkArrayList;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Julia");
        names.add("Adam");
        names.add("John");
        names.add("Anna");
        names.add("Jack");

        System.out.println(names.contains("Julia"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names);
    }
}
    /*Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?

    Find the size of your arrayList and print all values from that*/

