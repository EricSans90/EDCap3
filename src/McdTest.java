import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class McdTest {

    @Test
    void calculoMcd() {
        Mcd test1 = new Mcd(72,16);

        assertEquals(8,test1.calculoMcd(test1.getA(),test1.getB()), 0.001);
        //assertEquals(7,test1.calculoMcd(test1.getA(),test1.getB()), 0.001);
    }
}