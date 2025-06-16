package ex_24_Exceptions;

public class Lab223_Finally_not_executed {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/10;
            System.out.println(a);
            //System.exit(0); - can only stop the execution of the finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello last");
        }

    }
}
