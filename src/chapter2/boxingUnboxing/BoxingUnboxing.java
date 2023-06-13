package chapter2.boxingUnboxing;

public class BoxingUnboxing {
    public static void main(String[] args) {

//        Long a = null;
//        // a 참조 타입 -> 원시타입으로 Unboxing
//        // null을 unboxing 하면 Null Pointer Exception 발생
//        Long b = false ? 0L : a;
//        System.out.println("b = " + b);

        Long aa = null;
        // 명시적으로 boxing시 예외 발생 X
        Long bb = false ? (Long) 0L : (Long) aa;
        System.out.println("bb = " + bb);
    }
}
