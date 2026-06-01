package org.example;

import org.junit.jupiter.api.Test;

class JuegoTest {

    @Test
    void testAdivinarCorrecto() {
        Juego juego = new Juego(50, 7);
        assertEquals("CORRECTO", juego.adivinar(50));
        assertTrue(juego.isGanado());
    }

    @Test
    void testAdivinarMayor() {
        Juego juego = new Juego(70, 7);
        assertEquals("MAYOR", juego.adivinar(40));
    }

    @Test
    void testAdivinarMenor() {
        Juego juego = new Juego(30, 7);
        assertEquals("MENOR", juego.adivinar(60));
    }

    @Test
    void testSinIntentos() {
        Juego juego = new Juego(50, 3);
        juego.adivinar(10);
        juego.adivinar(20);
        juego.adivinar(30);
        assertEquals("SIN_INTENTOS", juego.adivinar(40));
    }

    @Test
    void testContadorIntentos() {
        Juego juego = new Juego(50, 7);
        juego.adivinar(10);
        juego.adivinar(20);
        assertEquals(2, juego.getIntentos());
    }

    @Test
    void testQuedanIntentos() {
        Juego juego = new Juego(50, 3);
        juego.adivinar(10);
        assertTrue(juego.quedanIntentos());
        juego.adivinar(20);
        juego.adivinar(30);
        assertFalse(juego.quedanIntentos());
    }
}
