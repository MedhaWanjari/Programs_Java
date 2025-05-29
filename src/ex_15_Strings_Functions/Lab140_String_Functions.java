package ex_15_Strings_Functions;

public class Lab140_String_Functions {
    public static void main(String[] args) {
        String str1 = "Hello"; // SCP -> creates or reuses "hello" in the string constant pool
        String str2 = "Hello";
        String str3 = new String("Hello"); // create a new object in heap OA (object area)

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3)); // true because content is the same
    }
}
