package ex_26_Collection_Framework_List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab230_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // array
        v.add("medha");
        v.add("amit");
        v.add("lucky");
        System.out.println(v);
        v.remove("amit");
        System.out.println(v);

        System.out.println("______");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-- Enumeration --");

        //extra enumeration
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
