import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeTestatTest {

    DeTestat dt = null;
    @BeforeEach
    void setUp() {
        dt = new DeTestat();
    }

    @Test
    void spuneNumeleClasei() {
        Assertions.assertEquals("DeTestat", dt.spuneNumeleClasei());
    }

    @Test
    void adunaDouaNumere() {
        Assertions.assertEquals(5, dt.adunaDouaNumere(3, 2));
    }
}