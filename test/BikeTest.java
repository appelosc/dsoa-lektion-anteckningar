import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testGetName() {
        Bike bike = new Bike("Foo");
        assertEquals("Foo", bike.getName());
    }

    @Test
    void testTrue(){
        assertTrue(1==1);
    }
}