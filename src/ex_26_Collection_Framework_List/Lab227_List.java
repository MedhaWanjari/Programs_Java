package ex_26_Collection_Framework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruits);
        // Static method can be fully implemented in interface.
        // Default method - can full implemented in interface.
        //fruits.add("cheery");  // java.lang.UnsupportedOperationException
        //fruits.remove("apple");// Not possible

        ArrayList arrayList = new ArrayList();
        arrayList.add("medha");
        arrayList.add(null);
        arrayList.add("wanjari");
        arrayList.add("wanjari");// Duplicate is allowed.
        arrayList.add(123);// Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);

    }
}
