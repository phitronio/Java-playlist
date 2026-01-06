abstract class BaseSuit {
    abstract void fly();
    abstract void attack();

    public void powerUp() {
        System.out.println("Powering up the suit!");
    }
}


public class Mark42 extends BaseSuit {

    @Override
    void fly() {
        System.out.println("Mark42 is flying!");
    }

    @Override
    void attack() {
        System.out.println("Mark42 is attacking with repulsor beams!");
    }

    public static void main(String[] args) {
        Mark42 mark42 = new Mark42();
        mark42.fly();
        mark42.attack();        
        mark42.powerUp();
    }
}