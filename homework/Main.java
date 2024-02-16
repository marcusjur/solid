package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        Saveable persister = new Persister(user);
        persister.save();
    }
}
