package chain;

public class Main {
    public static void main(String[] args) {
        BabkiRumors babkiRumors = new BabkiRumors();
        babkiRumors.setMessage("Strings are very popular in Innopolis");

        NewspaperRumors newspaperRumors = new NewspaperRumors();
        newspaperRumors.setBalance(11000);
        InternetRumors internetRumors = new InternetRumors();
        internetRumors.setConnected(false);
        babkiRumors.setRumor(newspaperRumors);
        newspaperRumors.setRumor(internetRumors);

        babkiRumors.obs();
    }
}
