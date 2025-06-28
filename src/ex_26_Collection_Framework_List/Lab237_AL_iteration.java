package ex_26_Collection_Framework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println("- To print ArrayList - 1");

        for (String str : mylist){
            System.out.println(str);
        }
        System.out.println("- To print ArrayList - 2");

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("- To print ArrayList - 3");

        for (int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
    }
}
