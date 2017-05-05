package chain;

public class NewspaperRumors extends Rumor {
    private long balance = 0;

    @Override
    public void obs() {
        if (balance > 10_000) {
            System.out.println("Rumors are false");
            return;
        }
        System.out.println("internet: ");
        super.obs();
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
