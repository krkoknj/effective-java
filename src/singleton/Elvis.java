package singleton;

public class Elvis {

    private String name;
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {
        this.name = "Default";
    }

    public void leaveTheBuilding() {}

    @Override
    public String toString() {
        return "Elvis{" +
                "name='" + name + '\'' +
                '}';
    }
}
