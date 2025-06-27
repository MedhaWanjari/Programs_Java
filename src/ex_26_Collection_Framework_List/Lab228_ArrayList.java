package ex_26_Collection_Framework_List;
import java.util.ArrayList;
import java.util.List;

public class Lab228_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("4"); //4
        list.add(true); //5

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3")); //find the first occurance of element in list
        System.out.println(list.lastIndexOf("3")); // find the first occurance of elements in list

        System.out.println(list);

        System.out.println(" ______");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
