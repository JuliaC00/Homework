package HomeworkArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words=new ArrayList<>();
        words.add("car");
        words.add("linen");
        words.add("sweater");
        words.add("book");
        words.add("butter");
        words.add("christmas");

        System.out.println(words);

        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}


