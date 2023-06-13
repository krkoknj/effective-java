package singleton;

import chapter2.singleton.Elvis;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class ElvisTest {

    @Test
    public void singletonTest() {
        Elvis elvis1 = Elvis.getInstance();
        Elvis elvis2 = Elvis.getInstance();
        assertSame(elvis1, elvis2);

        Supplier<Elvis> elvisSupplier = Elvis::getInstance;
        Elvis elvis = elvisSupplier.get();
        assertSame(elvis, elvis1);
    }
}