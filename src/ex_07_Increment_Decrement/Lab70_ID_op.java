package ex_07_Increment_Decrement;

public class Lab70_ID_op {
    public static void main(String[] args) {
        // pre - increment - ++ operand
        //value is incremented first and then stored in the result.
        int a = 10;//( ++a -> a+1)
        int b = ++a; //a -> 11, b -> 11
        System.out.println(a);
        System.out.println(b);



        //  Exp and Result Table
        // Line No | a | Result b
        //   8 | 10 | NA
        // 9   | 11 | 11
        // 10   | NA | 11
        // 11   | 11 | NA


    }
}
