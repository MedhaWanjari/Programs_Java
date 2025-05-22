package ex_09_Switch;

public class Lab96_Switch_JDK_13_Concept {
    public static void main(String[] args) {
        // jdk > 13

        int itemcode = 006;

        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of the them are electronics gadget");
                break;
            case 004,006,007:
                System.out.println("This is mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
