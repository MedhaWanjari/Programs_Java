package ex_06_Ternary_Operator;

public class Lab62_TO {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int age = 10;
        String CanIVote = age >= 18 ? "Yes, You can vote" : "No, You can't Vote";
        System.out.println(CanIVote);
    }
}
