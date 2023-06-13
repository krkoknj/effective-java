package chapter2.singleton;

/**
 * 싱글턴 사용 이유
 * 1. 한번의 객체 생성으로 재 사용이 가능하기 때문에 메모리 낭비를 방지할 수 있다.
 * 2. 싱글톤으로 생성된 객체는 무조건 한번 생성으로 전역성을 띄기에 다른 객체와 공유가 용이하다.
 */
public class SingletonMain {
    public static void main(String[] args) {
        Elvis instance = Elvis.getInstance();
        Elvis instance2 = Elvis.getInstance();
        System.out.println("instance = " + instance);
        System.out.println(instance == instance2);
    }
}
