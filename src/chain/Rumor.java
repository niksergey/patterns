package chain;

public abstract class Rumor {
    private Rumor rumor;


    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRumor(Rumor rumor) {
        this.rumor = rumor;
    }

    public void obs() {

        System.out.println(message);
        if (rumor != null)
            rumor.message = message;
            rumor.obs();
    }
}
