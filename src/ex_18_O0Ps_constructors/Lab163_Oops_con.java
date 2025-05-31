package ex_18_O0Ps_constructors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab163_Oops_con {

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
    }
}

class A{
    A(){
        System.out.println("I want to read a CSV file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when object is created");

        // FileInputStream fileInputStream = new FileInputStream("C://a.txt");

    }
}
