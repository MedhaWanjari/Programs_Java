package ex_24_Exceptions;

public class Lab_205_Unchecked {
    public static void main(String[] args) {

        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        // UnChecked -> ArithmeticException, NullPointerException

        //  java.lang.ArithmeticException: / by zero - UnChecked - JVM doesn't know

        String name = null;
        name.trim(); // ( " Pramod ") -> trailing spaces -> "Pramod"
        // java.lang.NullPointerException: Cannot invoke "String.trim()"


    }
}
