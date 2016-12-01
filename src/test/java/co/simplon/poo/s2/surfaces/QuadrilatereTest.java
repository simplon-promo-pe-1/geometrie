package co.simplon.poo.s2.surfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.simplon.poo.s2.surfaces.Quadrilatere;

public class QuadrilatereTest {

	@Test
	public void testCalculerPerimetre() {
		Quadrilatere q = new Quadrilatere(1, 3, 2, 1);

		float perimetre = q.calculerPerimetre();

		assertEquals(7, perimetre, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculerPerimetreCoteAZero() {
		Quadrilatere q = new Quadrilatere(0, 2, 3, 1);

		q.calculerPerimetre();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testCalculerSurface() {
		Quadrilatere q = new Quadrilatere(1, 2, 3, 1);

		q.calculerSurface();
	}

}
