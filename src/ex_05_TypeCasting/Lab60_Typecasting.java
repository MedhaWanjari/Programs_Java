package ex_05_TypeCasting;

public class Lab60_Typecasting {
    public static void main(String[] args) {
        long phone_no = 987654321;
        // short s = phone_no; // implicit
        short s = (short) phone_no; // explicit
    }
}
