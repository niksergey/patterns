package chain;

public class InternetRumors extends Rumor {
    private boolean isConnected;

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public void obs() {
        if (!isConnected) {
            System.out.println("Connection lost");
            return;
        }
        System.out.println("internet news: ");
        super.obs();
    }
}
