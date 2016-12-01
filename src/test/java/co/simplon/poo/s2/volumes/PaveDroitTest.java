package co.simplon.poo.s2.volumes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.simplon.poo.s2.volumes.PaveDroit;

public class PaveDroitTest {

	@Test
	public void testCalculerContenance() {
		PaveDroit pave = new PaveDroit(3, 2, 5);

		float contenance = pave.calculerContenance();
		
		assertEquals(30, contenance, 0);
	}
	
	@Test
	public void testCalculerContenanceHauteurNulle() {
		PaveDroit pave = new PaveDroit(3, 2, 0);

		float contenance = pave.calculerContenance();
		
		assertEquals(0, contenance, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculerContenanceHauteurNegative() {
		PaveDroit pave = new PaveDroit(3, 2, -2);

		pave.calculerContenance();
	}

}
