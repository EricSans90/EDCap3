import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopaTest {

    @org.junit.jupiter.api.Test
    void getTipoLiquido() {
        Copa c = new Copa( "Zumo Naranja", 80);
        assertEquals("Zumo Naranja", c.getTipoLiquido());

    }
    @org.junit.jupiter.api.Test
    void getPorcentajeLlena() {
        Copa c = new Copa( "Zumo Naranja", 80);
        assertEquals(80, c.getPorcentajeLlena(), 0.001);
    }

    @Test
    void setTipoLiquido() {
    }

    @Test
    void setPorcentajeLlena() {
    }
}