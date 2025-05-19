package ex_03_Literals;

public class Lab34_Literals_char {
    public static void main(String[] args) {

        // chars - store
        char c1 = 'A';
        // char c2 = "A" ; // string - bunch of char (multiple chars)

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("MedhaWanjari");
        //System.out.println("Medha" + new_line + " Wanjari");
        //System.out.println("Medha" + tab_line + "Wanjari");
        //System.out.println("Medha" + carriage_return + "Wanjari");

        char c10 = 'A';

        // ASCII, (limited numbers) - A- 65
        // Unicode (India, Japan, China) - Rupees -₹

        char rupees = '₹';
        System.out.println("medha has" + rupees + 10);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11 = '\u1F60';

    }
}
