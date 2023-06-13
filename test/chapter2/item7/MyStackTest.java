package chapter2.item7;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    public void testStackTest() {
        MyStack stack = new MyStack();
        Map map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        stack.push(map);
        System.out.println("map = " + map);
    }
}