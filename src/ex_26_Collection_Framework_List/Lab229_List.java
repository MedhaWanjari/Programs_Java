package ex_26_Collection_Framework_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Lab229_List {
    public static void main(String[] args) {

        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // Array format - continuous

        List mylist2 = new LinkedList(); // doubly linked list
        mylist2.add("medha");
        mylist2.add("wanjari");
        mylist2.add("amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);
        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("wanjari"));
        System.out.println(mylist2.indexOf("wanjari"));
    }

}
