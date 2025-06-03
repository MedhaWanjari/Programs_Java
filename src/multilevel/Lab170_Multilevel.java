package multilevel;

public class Lab170_Multilevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        pramod.home();

       // Son s1 = new GrandFather();
        //Son s1 = new Father();
        //Son amit = new son();

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();
        Father f2 = new Son();
        // Father f3 = new GrandFather();


    }
}
