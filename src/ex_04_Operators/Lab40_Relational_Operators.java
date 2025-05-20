package ex_04_Operators;

public class Lab40_Relational_Operators {
    public static void main(String[] args) {
        // < less than
        // <= less than or equal to
        // > greater than
        // >= greater than equal to
        // == equal to (but checking)
        // != not equal

        // all of them will result boolean output
        int a = 10;
        int b = 30;
        boolean c = a > b; // 10 > 30

        System.out.println(c);

        int age_mamita = 34;
        int age_pramod = 34;
        boolean result = age_pramod >= age_mamita;
        System.out.println(result);

        // age_pramod > age_mamita or age_pramod = age_mamita
    }
}
