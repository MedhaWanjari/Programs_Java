package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab138_Interview_Q2 {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP =1
        String s4 = "Hello";

        String s2 = new String("Hello"); // QA
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == ?  Comparsion -> Strings -> This check the locations ref.

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals ( content) -> value
        // How can I check the values? equals == value

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5)); //F
        System.out.println(s3.equalsIgnoreCase(s5)); // T

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD

    }
}
