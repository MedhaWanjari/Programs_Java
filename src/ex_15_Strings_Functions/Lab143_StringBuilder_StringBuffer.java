package ex_15_Strings_Functions;

public class Lab143_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // String - > 90%
        // StringBuilder -> 5-7% (Thread safety - we avoid it)
        // ThreadLocal -> Multi Threading ->

        StringBuffer stringBuffer = new StringBuffer("Medha");
        stringBuffer.append("Wanjari");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Medha");
        stringBuffer.append("Wanjari");
        System.out.println(stringBuffer);

        stringBuilder.append("World!"); // Modifies sb to "Hello World!"
        System.out.println(stringBuilder);

        String s1 = "Hello";
        String s2 = "World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
