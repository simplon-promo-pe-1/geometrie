package co.simplon.poo.s2.surfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.simplon.poo.s2.surfaces.Carre;

public class CarreTest {

	@Test
	public void testCalculerPerimetre() {
		Carre c = new Carre(3);

		float perimetre = c.calculerPerimetre();

		assertEquals(12, perimetre, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculerPerimetreCoteNegatif() {
		Carre c = new Carre(-1);

		c.calculerPerimetre();
	}
	
	@Test
	public void testCalculerSurface() {
		Carre c = new Carre(4);

		float surface = c.calculerSurface();
		
		assertEquals(16, surface, 0);
	}

}
