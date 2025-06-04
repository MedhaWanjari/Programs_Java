package police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }
}
