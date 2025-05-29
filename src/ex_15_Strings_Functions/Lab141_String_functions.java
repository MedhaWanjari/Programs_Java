package ex_15_Strings_Functions;

public class Lab141_String_functions {
    public static void main(String[] args) {

        String name = "Sonal";
        System.out.println(name.length());

        // 1. charAt()
        System.out.println(name.charAt(3));
       //  System.out.println(name.charAt(10)); StringIndexOutOfBoundsException

        // 2. Concat()
        System.out.println(name.concat("Patel"));
        System.out.println(name.concat("hello"));

        // 3. contains()
        System.out.println(name.contains("om"));
        System.out.println(name.contains("So"));

        // 4. equals()
        System.out.println(name.equals("Sonal"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("Sonal"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('0'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 8. length()
        System.out.println(name.length());

        // 9. split()
        String name4 = "medha@live.@1234";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));
        String ss = "hamburger";
        System.out.println(ss.substring(4, 9));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 17. trim()
        String name3 = "  Sonal Harish  ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Sonal"));

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("sonal"));

        StringBuilder stringbuilder = new StringBuilder("Sonal");
        stringbuilder.append("Patel");
        System.out.println(stringbuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append("Its my world");
        System.out.println(sb.toString());







    }
}
