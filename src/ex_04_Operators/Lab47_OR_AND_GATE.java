package ex_04_Operators;

public class Lab47_OR_AND_GATE {
    public static void main(String[] args) {

        // || - or

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);

        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
