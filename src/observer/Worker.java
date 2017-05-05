package observer;

public class Worker implements Observer {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void message(String message) {
        System.out.println("Worker " + id + " message: " + message);
    }
}
