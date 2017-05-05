package chain;

public class BabkiRumors extends Rumor {
    private boolean isAlive = true;

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void obs() {
        if (!isAlive) {
            System.out.println("Babka is dead");
            return;
        }
        System.out.println("Babka: ");
        super.obs();
    }
}
