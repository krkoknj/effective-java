package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Elvis instance = Elvis.INSTANCE;
        System.out.println("instance = " + instance);
    }
}
