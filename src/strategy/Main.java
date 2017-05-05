package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setHasFamily(false);
        context.setCash(1000);
        context.setHasFriends(true);
        context.celebrate();
    }
}
