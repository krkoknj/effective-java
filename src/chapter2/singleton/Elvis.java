package chapter2.singleton;

public class Elvis {

    private String name;

    // final -> 다른 객체 참조 불가능
    private static final Elvis INSTANCE = new Elvis();

    public static Elvis getInstance() {
        return INSTANCE;
    }

    // 싱글턴임을 보장해주는 메서드
    private Object readResolve() {
        // 진짜 Elvis를 반환하고, 가짜 Elvis는 가비지 컬렉터에 맡긴다.
        return INSTANCE;
    }
    private Elvis() {
        if (INSTANCE != null) {
            throw new RuntimeException("생성자를 호출할 수 없습니다!");
        }
    }
    public void leaveTheBuilding() {}

    @Override
    public String toString() {
        return "Elvis{" +
                "name='" + name + '\'' +
                '}';
    }

}
