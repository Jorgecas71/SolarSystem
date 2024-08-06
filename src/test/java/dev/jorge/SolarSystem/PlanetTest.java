package dev.jorge.SolarSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlanetTest {

    @Test
    public void testCalcularDensidad() {
        Planet planet = new Planet("Tierra", 1, 5.972E24, 1.08321E12, 12742, 149600000, PlanetType.TERRESTRE);
        double expectedDensidad = 5.513243046131406E12;
        assertEquals(expectedDensidad, planet.calcularDensidad(), 0.001);
    }
    

    @Test
    public void testEsPlanetaExterior() {
        Planet jupiter = new Planet("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778500000, PlanetType.GASEOSO);
        assertTrue(jupiter.esPlanetaExterior());

        Planet tierra = new Planet("Tierra", 1, 5.972E24, 1.08321E12, 12742, 149600000, PlanetType.TERRESTRE);
        assertFalse(tierra.esPlanetaExterior());
    }

    @Test
    public void testImprimir() {
        Planet planet = new Planet("Marte", 2, 6.4171E23, 1.6318E11, 6779, 227900000, PlanetType.TERRESTRE);
        planet.imprimir();
     
    }
}
