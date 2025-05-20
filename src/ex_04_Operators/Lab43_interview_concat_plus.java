package ex_04_Operators;

public class Lab43_interview_concat_plus {
    public static void main(String[] args) {
        String first_name = "Medha";
        String last_name = "Wanjari";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        //MedhaWanjari - first operator + performed as concatentation

        System.out.println(a + b + first_name + last_name);
        // first + math -> 20MedhaWanjari

        System.out.println(first_name + last_name + (a + b));

        // BODMAS
    }
}
