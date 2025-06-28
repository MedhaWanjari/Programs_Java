package ex_26_Collection_Framework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_Arraylist {
    public static void main(String[] args) {
        //List<Integer> l = new ArrayList();
       // l.add("medha");
        //l.add(123);

        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        //fruits1.add(123);
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println("fruits2");

        List vegetable = new ArrayList();
        vegetable.add("tomato");
        vegetable.add("potato");
        vegetable.add("onion");
        System.out.println(vegetable);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetable);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(2));
    }
}
